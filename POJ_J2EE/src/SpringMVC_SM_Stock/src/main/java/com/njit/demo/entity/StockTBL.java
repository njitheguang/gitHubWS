package com.njit.demo.entity;

import java.math.BigDecimal;

/**
 * 股票表(stockTBL)
 * 
 * @author Administrator
 *
 */
public class StockTBL {

	// 股票代码
	private String code;
	// 股票简称
	private String shortName;
	// 股票市场类型
	private String marketType;
	// 流通市值
	private BigDecimal marketValue;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getMarketType() {
		return marketType;
	}

	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}

	public BigDecimal getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

}
