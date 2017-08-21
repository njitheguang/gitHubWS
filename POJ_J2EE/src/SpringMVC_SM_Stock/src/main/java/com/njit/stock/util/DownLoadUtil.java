package com.njit.stock.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

public class DownLoadUtil {

	public DownLoadUtil() {
	}

	/**
	 * 从网络URL中下载文件
	 * 
	 * @param urlStr
	 * @param saveFileName
	 * @param savePath
	 * @throws IOException
	 */
	public static void downLoadFromUrl(String urlStr, String saveFileName, String savePath) {
		URL url = null;
		HttpURLConnection conn = null;
		try {
			url = new URL(urlStr);
			conn = (HttpURLConnection) url.openConnection();
			// 设置超时间为5秒
			conn.setConnectTimeout(5000 * 1000);
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
			File file = new File(saveDir + File.separator + saveFileName);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(getData);
			if (fos != null) {
				fos.close();
			}
			if (inputStream != null) {
				inputStream.close();
			}
			System.out.println("info:" + urlStr + " download success");
		} catch (SocketTimeoutException e) {
			System.out.println("下载超时(SocketTimeoutException)");
		} catch (IOException e) {
			System.out.println("info:" + urlStr + " download fail");
		} finally {
			conn.disconnect();
		}
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

}
