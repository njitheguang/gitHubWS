#!/bin/bash

export NLS_LANG=American_Japan.JA16SJIS

# SQL *Loader使用数据的保存场所
work_dir="/tmp/ittest2/sqlloader"

app_name=${1}

# DB连接信息的设定
case ${app_name} in
	sols )
		schema_name="It_sols_035"
		schema_pass="It_sols_035"
		db_url="solsdb";;
	okinawa )
		schema_name=""
		schema_pass=""
		db_url="";;
	sumy )
		schema_name=""
		schema_pass=""
		db_url="";;
	* )
		echo "error: [${app_name}]"
		exit 1
		;;
esac

# 外部文件(CSV)
csv_file_dir="${work_dir}/data/${app_name}"

# 控制(CTL)文件的路径
ctl_file_dir="${work_dir}/ctl"

# 执行日志的出力路径
log_file_dir="${work_dir}/log/${app_name}/`date +'%Y%m%d-%H%M%S'`"
mkdir -p ${log_file_dir}

# 全部日志
load_log_file="${log_file_dir}/sqlldr.log"

echo "`date +'%Y-%m-%d %H:%M:%S'` -SQL Loader START-" 2>&1 | tee -a ${load_log_file}

# [NDB父表的CSV文件有的场合，按照父表的顺序执行*Loader]
ndb_table_file="${work_dir}/bin/ndb_table_list.txt"

if [ ! -f ${ndb_table_file} ]; then
	echo "${ndb_table_file} not found" 2>&1 | tee -a ${load_log_file}
	exit 1
fi

for i in `cat ${ndb_table_file}`
do
	table_name=${i}
	
	if [ -f ${csv_file_dir}/${table_name}.csv ]; then
		start_load_time=`date +'%Y-%m-%d %H:%M:%S'`
		echo "${start_load_time} ${table_name} start" 2>&1 | tee -a ${load_log_file}
	    
		sqlldr ${schema_name}/${schema_pass}@${db_url} \
			control=${ctl_file_dir}/${table_name}.ctl \
			data=${csv_file_dir}/${table_name}.csv \
			bad=${log_file_dir}/${table_name}.bad log=${log_file_dir}/${table_name}.log
		rc=$?
		
		end_load_time=`date +'%Y-%m-%d %H:%M:%S'`
		echo "${end_load_time} ${table_name} end @status ${rc}" 2>&1 | tee -a ${load_log_file}
		
		start_load_time_s=`date -d "${start_load_time" '+%s'`
		end_load_time_s=`date -d "${end_load_time}" '+%s'`
		load_elapsed_time=$(( end_load_time_s - start_load_time_s ))
		
		echo "`date +'%Y-%m-%d %H:%M:%S'` ${table_name} elapsed_time(s) = ${load_elapsed_time}" &>> ${load_log_file}
	else
		echo "warn: ${csv_file_dir}/${table_name}.csv not found." 2>&1 | tee -a ${load_log_file}
	fi
done

