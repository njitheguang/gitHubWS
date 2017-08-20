package com.stockmarket.exec;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

import com.stockmarket.bean.StockBean;

public class DownLoadCsv {

	/**
	 * 从网络url中下载文件
	 * 
	 * @param urlStr
	 * @param fileName
	 * @param savePath
	 * @throws IOException
	 */
	public static void downLoadFromUrl(String urlStr, String fileName, String savePath) throws IOException {
		URL url = new URL(urlStr);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 设置超时间为3秒
		conn.setConnectTimeout(3000 * 1000);
		// 防止屏蔽程序抓取而返回403错误
		conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		// 得到输入流
		InputStream inputStream = conn.getInputStream();
		// 获取自己数组
		byte[] getData = readInputStream(inputStream);

		// 文件保存位置
		File saveDir = new File(savePath);
		if (!saveDir.exists()) {
			saveDir.mkdir();
		}
		File file = new File(saveDir + File.separator + fileName);
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(getData);
		if (fos != null) {
			fos.close();
		}
		if (inputStream != null) {
			inputStream.close();
		}
		System.out.println("info:" + url + " download success");
	}

	/**
	 * 从输入流中获取字节数组
	 * 
	 * @param inputStream
	 * @return
	 * @throws IOException
	 */
	public static byte[] readInputStream(InputStream inputStream) throws IOException {
		byte[] buffer = new byte[1024];
		int len = 0;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		while ((len = inputStream.read(buffer)) != -1) {
			bos.write(buffer, 0, len);
		}
		bos.close();
		return bos.toByteArray();
	}

	public static void main(String[] args) {
		try {
			// 变量
			int i = 0;
			// 上海交易所股票一览
			String sh_listFile = "work/test_data/input/2016-0416.xls";
			// 深圳交易所股票一览
			String sz_listFile = "work/test_data/input/2016-041602.xls";
			ReadExcel readExcel = new ReadExcel();
			// 上海交易所除外股票一览
			// 除外股票
			// 601020.SH : 华钰矿业
			// 601155.SH : 新城控股
			// 603027.SH : 千禾味业
			// 603028.SH : 赛福天
			// 603520.SH : 司太立
			// 603701.SH : 德宏股份
			// 603798.SH : 康普顿
			// 603861.SH : 白云电器
			// 603919.SH : 金徽酒
			CharSequence sh_exceptItems = "601020.SH,601155.SH,603027.SH,603028.SH,603520.SH,603701.SH,603798.SH,603861.SH,603919.SH";
			// 深圳交易所除外股票一览
			// 除外股票
			// 001979.SZ : 招商蛇口
			// 002760.SZ : 凤形股份
			// 002767.SZ : 先锋电子
			// 002769.SZ : 普路通
			// 002777.SZ : 久远银海
			// 002778.SZ : 高科石化
			// 002779.SZ : 中坚科技
			// 002780.SZ : 三夫户外
			// 002781.SZ : 奇信股份
			// 002782.SZ : 可立克
			// 002783.SZ : 凯龙股份
			// 002785.SZ : 万里石
			// 002786.SZ : 银宝山新
			// 002787.SZ : 华源包装
			// 002788.SZ : 鹭燕医药
			// 002789.SZ : 建艺集团
			// 002790.SZ : 瑞尔特
			// 002791.SZ : 坚朗五金
			// 002792.SZ : 通宇通讯
			// 002793.SZ : 东音股份
			// 300466.SZ : 赛摩电气
			// 300467.SZ : 迅游科技
			// 300469.SZ : 信息发展
			// 300471.SZ : 厚普股份
			// 300474.SZ : 景嘉微
			// 300479.SZ : 神思电子
			// 300484.SZ : 蓝海华腾
			// 300488.SZ : 恒锋工具
			// 300490.SZ : 华自科技
			// 300491.SZ : 通合科技
			// 300492.SZ : 山鼎设计
			// 300493.SZ : 润欣科技
			// 300494.SZ : 盛天网络
			// 300495.SZ : 美尚生态
			// 300496.SZ : 中科创达
			// 300497.SZ : 富祥股份
			// 300498.SZ : 温氏股份
			// 300499.SZ : 高澜股份
			// 300500.SZ : 苏州设计
			// 300501.SZ : 海顺新材
			// 300502.SZ : 新易盛
			// 300503.SZ : 昊志机电
			// 300505.SZ : 川金诺
			// 300506.SZ : 名家汇
			CharSequence sz_exceptItems = "001979.SZ,002760.SZ,002767.SZ,002769.SZ,002777.SZ,002778.SZ,002779.SZ,002780.SZ,002781.SZ,"
					+ "002782.SZ,002783.SZ,002785.SZ,002786.SZ,002787.SZ,002788.SZ,002789.SZ,002790.SZ,002791.SZ,002792.SZ,002793.SZ,"
					+ "300466.SZ,300467.SZ,300469.SZ,300471.SZ,300474.SZ,300479.SZ,300484.SZ,300488.SZ,300490.SZ,300491.SZ,300492.SZ,"
					+ "300493.SZ,300494.SZ,300495.SZ,300496.SZ,300497.SZ,300498.SZ,300499.SZ,300500.SZ,300501.SZ,300502.SZ,300503.SZ,"
					+ "300505.SZ,300506.SZ";
			// 上海股票交易所
			ArrayList<StockBean> list = readExcel.GetAllRows(sh_listFile);
			for (i = 0; i < list.size(); i++) {

				if (!StringUtils.contains(sh_exceptItems, list.get(i).getStockCode())) {
					System.out.print(list.get(i).getStockCode() + " : ");
					System.out.println(list.get(i).getStockName());
					downLoadFromUrl(
							"http://table.finance.yahoo.com/table.csv?s="
									+ StringUtils.left(list.get(i).getStockCode(), 6) + ".ss",
							StringUtils.replace(list.get(i).getStockName(), "*", "") + ".csv",
							"work/test_data/output/");

				}
			}
			// 深圳股票交易所
			list.clear();
			list = readExcel.GetAllRows(sz_listFile);
			for (i = 0; i < list.size(); i++) {

				if (!StringUtils.contains(sz_exceptItems, list.get(i).getStockCode())) {
					System.out.print(list.get(i).getStockCode() + " : ");
					System.out.println(list.get(i).getStockName());
					downLoadFromUrl(
							"http://table.finance.yahoo.com/table.csv?s="
									+ StringUtils.left(list.get(i).getStockCode(), 6) + ".sz",
							StringUtils.replace(list.get(i).getStockName(), "*", "") + ".csv",
							"work/test_data/output/");

				}
			}
		} catch (Exception e) {
		}
	}

}
