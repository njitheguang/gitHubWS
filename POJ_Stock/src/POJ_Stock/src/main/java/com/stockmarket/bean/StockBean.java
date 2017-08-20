package com.stockmarket.bean;
/**
 * 问财网上输入：上交所或者深交所，得到的CSV使用的Bean
 * @author Administrator
 *
 */
public class StockBean {
	//股票代码
	private String stockCode = null;
	//股票简称
	private String stockName = null;
	/**
	 * @return the stockCode
	 */
	public String getStockCode() {
		return stockCode;
	}
	/**
	 * @param stockCode the stockCode to set
	 */
	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}
	/**
	 * @return the stockName
	 */
	public String getStockName() {
		return stockName;
	}
	/**
	 * @param stockName the stockName to set
	 */
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	
}
