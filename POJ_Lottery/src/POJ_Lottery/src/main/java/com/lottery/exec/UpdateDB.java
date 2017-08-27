package com.lottery.exec;

import java.util.ArrayList;

import com.lottery.bean.LotteryViewDto;
import com.lottery.comm.DBHelper;
import com.lottery.comm.ReadExcel;

public class UpdateDB {

	static DBHelper db1 = null;

	public static void main(String[] args) {
		ArrayList<String> listFilesName = new ArrayList<String>();
		listFilesName.add("work/test_data/input/2003.xls");
		listFilesName.add("work/test_data/input/2004.xls");
		listFilesName.add("work/test_data/input/2005.xls");
		listFilesName.add("work/test_data/input/2006.xls");
		listFilesName.add("work/test_data/input/2007.xls");
		listFilesName.add("work/test_data/input/2008.xls");
		listFilesName.add("work/test_data/input/2009.xls");
		listFilesName.add("work/test_data/input/2010.xls");
		listFilesName.add("work/test_data/input/2011.xls");
		listFilesName.add("work/test_data/input/2012.xls");
		listFilesName.add("work/test_data/input/2013.xls");
		listFilesName.add("work/test_data/input/2014.xls");
		listFilesName.add("work/test_data/input/2015.xls");
		listFilesName.add("work/test_data/input/2016.xls");
		ReadExcel readExcel = new ReadExcel();
		db1 = new DBHelper();
		for (int j = 0; j < listFilesName.size(); j++) {
			// 变量
			boolean resultFlag = false;
			ArrayList<LotteryViewDto> list = readExcel.GetAllRows(listFilesName.get(j));
			for (int i = 0; i < list.size(); i++) {
				resultFlag = DBHelper.select(list.get(i));
				if (!resultFlag) {
					DBHelper.insert(list.get(i));
				}
			}
			// 深圳股票交易所
			list.clear();
		}
	}
}
