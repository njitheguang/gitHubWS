package com.lottery.comm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lottery.bean.LotteryViewDto;

public class DBHelper {
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
	 * 插入数据
	 * 
	 * @param lotteryViewDto
	 * @return
	 */
	public static int insert(LotteryViewDto lotteryViewDto) {
		Connection conn = getConn();
		int i = 0;
		String sql = "INSERT INTO lotteryViewTBL (issueID,redBall01,redBall02,redBall03,redBall04,redBall05,redBall06,blueBall,lotteryDate) VALUES (?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, lotteryViewDto.getIssueID());
			pstmt.setInt(2, lotteryViewDto.getRedBall01());
			pstmt.setInt(3, lotteryViewDto.getRedBall02());
			pstmt.setInt(4, lotteryViewDto.getRedBall03());
			pstmt.setInt(5, lotteryViewDto.getRedBall04());
			pstmt.setInt(6, lotteryViewDto.getRedBall05());
			pstmt.setInt(7, lotteryViewDto.getRedBall06());
			pstmt.setInt(8, lotteryViewDto.getBlueBall());
			pstmt.setDate(9, lotteryViewDto.getLotteryDate());
			i = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("插入成功！ " + lotteryViewDto.getIssueID());
		return i;
	}

	/**
	 * 查询数据
	 * 
	 * @param lotteryViewDto
	 * @return
	 */
	public static boolean select(LotteryViewDto lotteryViewDto) {
		Connection conn = getConn();
		boolean exists = false;
		String sql = "select * from lotteryViewTBL where issueID = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, lotteryViewDto.getIssueID());
			ResultSet rs = pstmt.executeQuery();
			exists = rs.next();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return exists;
	}
}
