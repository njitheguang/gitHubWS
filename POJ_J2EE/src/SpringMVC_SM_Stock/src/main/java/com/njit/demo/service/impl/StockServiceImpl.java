package com.njit.demo.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.njit.demo.entity.Stock;
import com.njit.demo.entity.StockDataTBL;
import com.njit.demo.entity.StockTBL;
import com.njit.demo.mapper.StockMapper;
import com.njit.demo.service.StockService;
import com.njit.stock.util.DownLoadUtil;
import com.njit.stock.util.ExcelUtil;
import com.njit.stock.util.StockUtil;

@Service("stockService")
public class StockServiceImpl implements StockService {

	@Autowired
	private StockMapper stockMapper;

	@Override
	public void insertStock(Stock stock) {
		stockMapper.insertStock(stock);
	}

	@Override
	public List<Stock> selectStock(Stock stock) {
		return stockMapper.selectStock(stock);
	}

	@Override
	public boolean existStock(String stockname) {
		List<Stock> stockList = stockMapper.selectStockByStockName(stockname);
		if (stockList.size() > 0)
			return true;
		else
			return false;
	}

	/**
	 * 股票数据下载(CSV格式)
	 */
	@Override
	public void download() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();

		// 上海交易所股票一览和深圳交易所股票一览
		ArrayList<String> fileLst = StockUtil
				.getFileList(new File(request.getSession().getServletContext().getRealPath("/work/data/input/")));
		// CSV文件保存路径
		String fileSave = request.getSession().getServletContext().getRealPath("/work/data/output/");
		//所有文件删除
		StockUtil.deleteFilesByCMD(new File(fileSave));
		ExcelUtil readExcel = new ExcelUtil();
		for (int i = 0; i < fileLst.size(); i++) {
			System.out.println(fileLst.get(i));
			ArrayList<Stock> list = readExcel.GetAllRows(fileLst.get(i));
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j).getStockCode() + " : ");
				System.out.println(list.get(j).getStockName());
				//上交所
				if(StringUtils.right(fileLst.get(i), 7).equals("上交所.xls")) {
					DownLoadUtil
					.downLoadFromUrl(
							"http://table.finance.yahoo.com/table.csv?s="
									+ StringUtils.left(list.get(j).getStockCode(), 6) + ".ss",
									StringUtils.left(list.get(j).getStockCode(), 6) + ".csv", fileSave);
				}
				//深交所
				if(StringUtils.right(fileLst.get(i), 7).equals("深交所.xls")) {
					DownLoadUtil
					.downLoadFromUrl(
							"http://table.finance.yahoo.com/table.csv?s="
									+ StringUtils.left(list.get(j).getStockCode(), 6) + ".sz",
									StringUtils.left(list.get(j).getStockCode(), 6) + ".csv", fileSave);
				}
			}
			list.clear();

		}
	}

	/**
	 * 导入股票表(stockTBL)
	 */
	@Override
	public void importStockTBL() {

		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		// 上海交易所股票一览和深圳交易所股票一览
		ArrayList<String> fileLst = StockUtil
				.getFileList(new File(request.getSession().getServletContext().getRealPath("/work/data/input/")));
		ExcelUtil readExcel = new ExcelUtil();
		for (int i = 0; i < fileLst.size(); i++) {
			ArrayList<StockTBL> list = readExcel.GetAllRowsToStockTBL(fileLst.get(i));
			for (int j = 0; j < list.size(); j++) {
				// 检索处理
				List<StockTBL> stList = stockMapper.selectStockTBLByCode(list.get(j).getCode());
				if (stList.size() == 0) {
					// 保存处理
					stockMapper.insertStockTBL(list.get(j));
				}
			}
		}
	}

	/**
	 * 导入股票数据表(stockDataTBL)
	 * E:\developerHome\eclipseWorkspace\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\SpringMVC_SM_Stock\work\data\output\
	 */
	@Override
	public void importStockDataTBL() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
				.getRequest();
		// 上海交易所股票一览和深圳交易所股票一览
		ArrayList<String> fileLst = StockUtil
				.getFileList(new File(request.getSession().getServletContext().getRealPath("/work/data/output/")));
		System.out.println(request.getSession().getServletContext().getRealPath("/work/data/output/"));
		
		ExcelUtil readExcel = new ExcelUtil();
		for (int i = 0; i < fileLst.size(); i++) {
			ArrayList<StockDataTBL> list = readExcel.GetAllRowsToStockDataTBL(fileLst.get(i));
			for (int j = 0; j < list.size(); j++) {
				// 检索处理
				List<StockTBL> stList = stockMapper.selectStockDataTBLByCodeAndDate(list.get(j));
				if (stList.size() == 0) {
					// 保存处理
					stockMapper.insertStockDataTBL(list.get(j));
				} else {
					// 检索处理
					List<StockTBL> lRList = stockMapper.selectStockDataTBLByCodeAndDate(list.get(list.size() - 1));
					// 最后一条记录存在的场合
					if (lRList.size() != 0) {
						break;
					}
				}
			}
		}
	}

}
