package com.njit.stock.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.njit.demo.entity.Stock;
import com.njit.demo.entity.StockDataTBL;
import com.njit.demo.entity.StockTBL;

public class ExcelUtil {

	/**
	 * 得到Excel数据的所有行
	 * 
	 * @param fileName
	 *            Excel文件名
	 * @return allRowsLst 股票bean
	 */
	public ArrayList<Stock> GetAllRows(String fileName) {
		ArrayList<Stock> allRowsLst = new ArrayList<Stock>();
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
				if (row.getRowNum() > 0) {
					Stock stock = new Stock();
					// 股票代码
					stock.setStockCode(row.getCell(0).getStringCellValue());
					// 股票简称
					stock.setStockName(row.getCell(1).getStringCellValue());
					allRowsLst.add(stock);
				}

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return allRowsLst;
	}

	/**
	 * 得到Excel数据的所有行导入股票表(stockTBL)
	 * 
	 * @param fileName
	 *            Excel文件名
	 * @return allRowsLst 股票bean
	 */
	public ArrayList<StockTBL> GetAllRowsToStockTBL(String fileName) {
		ArrayList<StockTBL> allRowsLst = new ArrayList<StockTBL>();
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
				if (row.getRowNum() > 0) {
					StockTBL stockTBL = new StockTBL();
					// 股票代码
					stockTBL.setCode(StringUtils.left(row.getCell(0).getStringCellValue(), 6));
					// 股票简称
					stockTBL.setShortName(row.getCell(1).getStringCellValue());
					// 股票市场类型
					stockTBL.setMarketType(row.getCell(4).getStringCellValue());
					// 流通市值
					if (!StringUtils.equals(row.getCell(5).toString(), "--")) {
						stockTBL.setMarketValue(new BigDecimal(row.getCell(5).getNumericCellValue()));
					} else {
						stockTBL.setMarketValue(new BigDecimal(0.00));
					}
					allRowsLst.add(stockTBL);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return allRowsLst;
	}

	/**
	 * 得到Excel数据的所有行导入到股票数据表(stockDataTBL)
	 * 
	 * @param fileName
	 *            Excel文件名
	 * @return allRowsLst 股票bean
	 */
	public ArrayList<StockDataTBL> GetAllRowsToStockDataTBL(String fileName) {
		ArrayList<StockDataTBL> allRowsLst = new ArrayList<StockDataTBL>();
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
				if (row.getRowNum() > 0) {
					StockDataTBL stockDataTBL = new StockDataTBL();
					// 股票代码
					stockDataTBL.setCode(StringUtils.mid(fileName, StringUtils.lastIndexOf(fileName, "\\") + 1, 6) );
					// 日期
					stockDataTBL.setCurrentDate(new Date(row.getCell(0).getDateCellValue().getTime()) );
					// 开盘价
					if (!StringUtils.equals(row.getCell(1).toString(), "--")) {
						stockDataTBL.setOpen(new BigDecimal(row.getCell(1).getNumericCellValue()));
					} else {
						stockDataTBL.setOpen(new BigDecimal("0.00"));
					}
					// 最高价
					if (!StringUtils.equals(row.getCell(2).toString(), "--")) {
						stockDataTBL.setHigh(new BigDecimal(row.getCell(2).getNumericCellValue()));
					} else {
						stockDataTBL.setHigh(new BigDecimal("0.00"));
					}
					// 最低价
					if (!StringUtils.equals(row.getCell(3).toString(), "--")) {
						stockDataTBL.setLow(new BigDecimal(row.getCell(3).getNumericCellValue()));
					} else {
						stockDataTBL.setLow(new BigDecimal("0.00"));
					}
					// 收盘价
					if (!StringUtils.equals(row.getCell(4).toString(), "--")) {
						stockDataTBL.setClose(new BigDecimal(row.getCell(4).getNumericCellValue()));
					} else {
						stockDataTBL.setClose(new BigDecimal("0.00"));
					}
					// 成交量
					if (!StringUtils.equals(row.getCell(5).toString(), "--")) {
						stockDataTBL.setVolume(new BigDecimal(row.getCell(5).getNumericCellValue()));
					} else {
						stockDataTBL.setVolume(new BigDecimal("0.00"));
					}
					// 复权收盘价
					if (!StringUtils.equals(row.getCell(6).toString(), "--")) {
						stockDataTBL.setAdjClose(new BigDecimal(row.getCell(6).getNumericCellValue()));
					} else {
						stockDataTBL.setAdjClose(new BigDecimal("0.00"));
					}
					allRowsLst.add(stockDataTBL);
				}

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return allRowsLst;
	}
}
