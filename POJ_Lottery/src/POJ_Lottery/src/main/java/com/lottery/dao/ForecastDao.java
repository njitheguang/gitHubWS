package com.lottery.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.lottery.bean.LotteryViewDto;

public class ForecastDao {

	/**
	 * 获取数据库连接
	 * 
	 * @return
	 */
	public static Connection getConn() {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/poj_lotterydb";
		String username = "root";
		String password = "root";
		Connection conn = null;
		try {
			Class.forName(driver); // classLoader,加载对应驱动
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * 查询数据
	 * 
	 * @param lotteryViewDto
	 * @return
	 */
	public static ArrayList<LotteryViewDto> select() {
		Connection conn = getConn();
		String sql = "select * from lotteryViewTBL order by issueID asc";
		ArrayList<LotteryViewDto> retList = null;
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			retList = new ArrayList<LotteryViewDto>();
			while (rs.next()) {
				LotteryViewDto retLottery = new LotteryViewDto();
				// 期号(issueID)
				retLottery.setIssueID(rs.getInt("issueID"));
				// 红球①(redBall01)
				retLottery.setRedBall01(rs.getInt("redBall01"));
				// 红球②(redBall02)
				retLottery.setRedBall02(rs.getInt("redBall02"));
				// 红球③(redBall03)
				retLottery.setRedBall03(rs.getInt("redBall03"));
				// 红球④(redBall04)
				retLottery.setRedBall04(rs.getInt("redBall04"));
				// 红球⑤(redBall05)
				retLottery.setRedBall05(rs.getInt("redBall05"));
				// 红球⑥(redBall06)
				retLottery.setRedBall06(rs.getInt("redBall06"));
				// 篮球(blueBall)
				retLottery.setBlueBall(rs.getInt("blueBall"));
				// 开奖日期(lotteryDate)
				retLottery.setLotteryDate(rs.getDate("lotteryDate"));
				retList.add(retLottery);
			}
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return retList;
	}
}
