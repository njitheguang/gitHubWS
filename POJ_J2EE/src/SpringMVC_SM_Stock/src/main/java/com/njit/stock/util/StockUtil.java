package com.njit.stock.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * 功能：股票类String的相关共通处理
 * 
 * @author Administrator
 *
 */
public class StockUtil {

	// 构造函数
	public StockUtil() {

	}

	/**
	 * 判断浮点数（double和float）
	 * @param str
	 * @return
	 */
	public static boolean isDouble(String str) {
		if (null == str || "".equals(str)) {
			return false;
		}
		Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
		return pattern.matcher(str).matches();
	}

	/**
	 * 文件夹下文件名的获取
	 * @param file
	 * @return
	 */
	public static ArrayList<String> getFileList(File file) {
		ArrayList<String> retList = new ArrayList<String>();
		File flist[] = file.listFiles();
		if (flist == null || flist.length == 0) {
			return null;
		}
		for (File f : flist) {
			if (f.isDirectory()) {
				// 递归调用
				getFileList(f);
			} else {
				// 追加所有的文件名（全路径）
				retList.add(f.getAbsolutePath());
			}
		}
		return retList;
	}
	
	/**
	 * 删除文件下所有文件
	 * @param file
	 */
	public static void deleteFilesByCMD(File file) {
		File flist[] = file.listFiles();
		Runtime rt = Runtime.getRuntime();
		String cmd = null;
		if (flist == null || flist.length == 0) {
			return;
		}
		for (File f : flist) {
			try {
			cmd = "cmd.exe /c del /q/a/f/s "+f.getAbsolutePath();
				rt.exec(cmd);
			} catch (IOException e) {
				System.out.println("调用系统命令失败了,所有文件删除失败!");
			}
		}
		System.out.println("成功执行了命令，所有文件删除成功!");
	}
}
