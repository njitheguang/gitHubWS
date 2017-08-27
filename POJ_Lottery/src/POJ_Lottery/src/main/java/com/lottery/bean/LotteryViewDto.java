package com.lottery.bean;

import java.sql.Date;

/**
 * 彩票一览表
 * 
 * @author Administrator
 *
 */
public class LotteryViewDto {
	//番号
	private int id = 0;
	// 期号
	private int issueID = 0;
	// 红球①
	private int redBall01 = 0;
	// 红球②
	private int redBall02 = 0;
	// 红球③
	private int redBall03 = 0;
	// 红球④
	private int redBall04 = 0;
	// 红球⑤
	private int redBall05 = 0;
	// 红球⑥
	private int redBall06 = 0;
	// 篮球
	private int blueBall = 0;
	// 开奖日期
	private Date lotteryDate = null;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the issueID
	 */
	public int getIssueID() {
		return issueID;
	}

	/**
	 * @param issueID
	 *            the issueID to set
	 */
	public void setIssueID(int issueID) {
		this.issueID = issueID;
	}

	/**
	 * @return the redBall01
	 */
	public int getRedBall01() {
		return redBall01;
	}

	/**
	 * @param redBall01
	 *            the redBall01 to set
	 */
	public void setRedBall01(int redBall01) {
		this.redBall01 = redBall01;
	}

	/**
	 * @return the redBall02
	 */
	public int getRedBall02() {
		return redBall02;
	}

	/**
	 * @param redBall02
	 *            the redBall02 to set
	 */
	public void setRedBall02(int redBall02) {
		this.redBall02 = redBall02;
	}

	/**
	 * @return the redBall03
	 */
	public int getRedBall03() {
		return redBall03;
	}

	/**
	 * @param redBall03
	 *            the redBall03 to set
	 */
	public void setRedBall03(int redBall03) {
		this.redBall03 = redBall03;
	}

	/**
	 * @return the redBall04
	 */
	public int getRedBall04() {
		return redBall04;
	}

	/**
	 * @param redBall04
	 *            the redBall04 to set
	 */
	public void setRedBall04(int redBall04) {
		this.redBall04 = redBall04;
	}

	/**
	 * @return the redBall05
	 */
	public int getRedBall05() {
		return redBall05;
	}

	/**
	 * @param redBall05
	 *            the redBall05 to set
	 */
	public void setRedBall05(int redBall05) {
		this.redBall05 = redBall05;
	}

	/**
	 * @return the redBall06
	 */
	public int getRedBall06() {
		return redBall06;
	}

	/**
	 * @param redBall06
	 *            the redBall06 to set
	 */
	public void setRedBall06(int redBall06) {
		this.redBall06 = redBall06;
	}

	/**
	 * @return the blueBall
	 */
	public int getBlueBall() {
		return blueBall;
	}

	/**
	 * @param blueBall
	 *            the blueBall to set
	 */
	public void setBlueBall(int blueBall) {
		this.blueBall = blueBall;
	}

	/**
	 * @return the lotteryDate
	 */
	public Date getLotteryDate() {
		if (lotteryDate == null) {
			lotteryDate = new Date(System.currentTimeMillis());
		}
		return lotteryDate;
	}

	/**
	 * @param lotteryDate
	 *            the lotteryDate to set
	 */
	public void setLotteryDate(Date lotteryDate) {
		this.lotteryDate = lotteryDate;
	}

}
