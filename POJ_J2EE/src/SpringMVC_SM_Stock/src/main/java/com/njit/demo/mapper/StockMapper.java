package com.njit.demo.mapper;

import java.util.List;

import com.njit.demo.entity.Stock;
import com.njit.demo.entity.StockDataTBL;
import com.njit.demo.entity.StockTBL;

public interface StockMapper {

	public List<Stock> selectStock(Stock stock);

	public void insertStock(Stock stock);

	public List<Stock> selectStockByStockName(String stockname);
	
	//股票表保存
	public void insertStockTBL(StockTBL stockTBL);
	//股票表检索
	public List<StockTBL> selectStockTBLByCode(String code);
	//股票数据表保存
	public void insertStockDataTBL(StockDataTBL stockDataTBL);
	//股票数据表检索
	public List<StockTBL> selectStockDataTBLByCodeAndDate(StockDataTBL stockDataTBL);

}
