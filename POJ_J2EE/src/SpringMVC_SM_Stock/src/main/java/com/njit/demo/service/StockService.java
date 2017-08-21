package com.njit.demo.service;

import java.util.List;

import com.njit.demo.entity.Stock;

public interface StockService {

	public void insertStock(Stock stock);
	
	public List<Stock> selectStock(Stock stock);

	public boolean existStock(String stockname);

	public void download();
	
	public void importStockTBL();
	
	public void importStockDataTBL();
}
