package com.lottery.exec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.commons.lang3.StringUtils;

public class WebTxtProcess {

	public static void main(String[] args) {
		String filePath = "./work/test_data/webTxt/web.txt";
		readTxtFile(filePath);
	}

	public static void readTxtFile(String filePath) {
		int countLine = 0;
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { // 判断文件是否存在
				InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);// 考虑到编码格式
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					countLine++;
					if (countLine % 4 == 1) {
						// System.out.println(lineTxt);
						// 期数
						 System.out.println(StringUtils.left(lineTxt, 7));
						// 日期
//						System.out.println(StringUtils.mid(lineTxt, 8, 10));
					}
					if (countLine % 4 == 2) {
						//红球和篮球
						System.out.println(StringUtils.mid(lineTxt, 0, 2) + "," + StringUtils.mid(lineTxt, 2, 2) + ","
								+ StringUtils.mid(lineTxt, 4, 2) + "," + StringUtils.mid(lineTxt, 6, 2) + ","
								+ StringUtils.mid(lineTxt, 8, 2) + "," + StringUtils.mid(lineTxt, 10, 2)+ "|" + StringUtils.mid(lineTxt, 13, 2));
					}
				}
				read.close();
			} else {
				System.out.println("找不到指定的文件");
			}
		} catch (Exception e) {
			System.out.println("读取文件内容出错");
			e.printStackTrace();
		}

	}

}
