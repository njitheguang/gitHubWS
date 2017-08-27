package com.lottery.comm;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.lottery.bean.LotteryViewDto;

public class ReadExcel {

	/**
	 * 得到Excel數據的所有行
	 * 
	 * @param fileName
	 *            Excel文件名
	 * @return allRowsLst 股票bean
	 */
	public ArrayList<LotteryViewDto> GetAllRows(String fileName) {
		ArrayList<LotteryViewDto> allRowsLst = new ArrayList<LotteryViewDto>();
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
					LotteryViewDto lotteryViewDto = new LotteryViewDto();
					// 期号(issueID)
					lotteryViewDto.setIssueID(
							Integer.valueOf(StringUtils.left(String.valueOf(row.getCell(0).getNumericCellValue()), 7)));
					// 红球①(redBall01)
					lotteryViewDto
							.setRedBall01(Integer.valueOf(StringUtils.left(row.getCell(1).getStringCellValue(), 2)));
					// 红球②(redBall02)
					lotteryViewDto
							.setRedBall02(Integer.valueOf(StringUtils.mid(row.getCell(1).getStringCellValue(), 3, 2)));
					// 红球③(redBall03)
					lotteryViewDto
							.setRedBall03(Integer.valueOf(StringUtils.mid(row.getCell(1).getStringCellValue(), 6, 2)));
					// 红球④(redBall04)
					lotteryViewDto
							.setRedBall04(Integer.valueOf(StringUtils.mid(row.getCell(1).getStringCellValue(), 9, 2)));
					// 红球⑤(redBall05)
					lotteryViewDto
							.setRedBall05(Integer.valueOf(StringUtils.mid(row.getCell(1).getStringCellValue(), 12, 2)));
					// 红球⑥(redBall06)
					lotteryViewDto
							.setRedBall06(Integer.valueOf(StringUtils.mid(row.getCell(1).getStringCellValue(), 15, 2)));
					// 篮球
					lotteryViewDto
							.setBlueBall(Integer.valueOf(StringUtils.mid(row.getCell(1).getStringCellValue(), 18, 2)));
					// 开奖日期
					Date date = row.getCell(2).getDateCellValue();
					lotteryViewDto.setLotteryDate(new java.sql.Date(date.getTime()));

					allRowsLst.add(lotteryViewDto);
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return allRowsLst;
	}
}
