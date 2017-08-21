package com.njit.demo.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;

public class StockDataTBL {

	// 番号
	private BigInteger id;
	// 股票代码
	private String code;
	// 日期
	private Date currentDate;
	// 开盘价
	private BigDecimal open;
	// 最高价
	private BigDecimal high;
	// 最低价
	private BigDecimal low;
	/// 收盘价
	private BigDecimal close;
	// 成交量
	private BigDecimal volume;
	// 复权收盘价
	private BigDecimal adjClose;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public BigDecimal getOpen() {
		return open;
	}

	public void setOpen(BigDecimal open) {
		this.open = open;
	}

	public BigDecimal getHigh() {
		return high;
	}

	public void setHigh(BigDecimal high) {
		this.high = high;
	}

	public BigDecimal getLow() {
		return low;
	}

	public void setLow(BigDecimal low) {
		this.low = low;
	}

	public BigDecimal getClose() {
		return close;
	}

	public void setClose(BigDecimal close) {
		this.close = close;
	}

	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public BigDecimal getAdjClose() {
		return adjClose;
	}

	public void setAdjClose(BigDecimal adjClose) {
		this.adjClose = adjClose;
	}
}
