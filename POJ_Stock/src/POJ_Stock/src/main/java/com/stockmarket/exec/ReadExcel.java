package com.stockmarket.exec;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.stockmarket.bean.StockBean;

public class ReadExcel {

	/**
	 * 得到Excel數據的所有行
	 * 
	 * @param fileName
	 *            Excel文件名
	 * @return allRowsLst 股票bean
	 */
	public ArrayList<StockBean> GetAllRows(String fileName) {
		ArrayList<StockBean> allRowsLst = new ArrayList<StockBean>();
		boolean isE2007 = false; // 判断是否是excel2007格式
		if (fileName.endsWith("xlsx")) {
			isE2007 = true;
		}
		try {
			InputStream input = new FileInputStream(fileName); // 建立输入流
			Workbook workbook = null;
			// 根据文件格式(2003或者2007)来初始化
			if (isE2007) {
				workbook = new XSSFWorkbook(input);
			} else {
				workbook = new HSSFWorkbook(input);
			}
			// 获得第一个表单
			Sheet sheet = workbook.getSheetAt(0);
			// 获得第一个表单的迭代器
			Iterator<Row> rows = sheet.rowIterator();
			while (rows.hasNext()) {
				Row row = rows.next(); // 获得行数据
				if (row.getRowNum() > 1) {
					StockBean stockBean = new StockBean();
					//股票代码
					stockBean.setStockCode(row.getCell(0).getStringCellValue());
					//股票简称
					stockBean.setStockName(row.getCell(1).getStringCellValue());
					allRowsLst.add(stockBean);
				}

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return allRowsLst;
	}
}
