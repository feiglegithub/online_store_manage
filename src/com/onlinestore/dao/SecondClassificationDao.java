package com.onlinestore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlinestore.domain.PrimaryClassification;
import com.onlinestore.domain.SecondClassification;
import com.onlinestore.tools.JDBCUtils;

public class SecondClassificationDao {

	public SecondClassificationDao() {
		// TODO Auto-generated constructor stub
	}

	public static int add(String name,String primaryClassification) throws SQLException {
		int rows = 0;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(
				"insert into second_classification(name,primary_classification) "
				+ "values('"+name+"','"+primaryClassification+"')");

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
	
	public static int deleteByPrimaryClassification(String primaryClassification) throws SQLException {
		int rows = 0;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(
				"delete from second_classification where primary_classification = '" 
		+ primaryClassification + "'");

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
	
	public static int delete(int id) throws SQLException {
		int rows = 0;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(
				"delete from second_classification where id = " + id);

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}

	public static List<SecondClassification> getAllClassification() {
		List<SecondClassification> list = new ArrayList<SecondClassification>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtils.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from second_classification");
			while (rs.next()) {
				SecondClassification secondClassifition = new SecondClassification();
				secondClassifition.setId(rs.getInt("id"));
				secondClassifition.setName(rs.getString("name"));
				secondClassifition.setPrimaryClassifition(rs.getString("primary_classification"));
				list.add(secondClassifition);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}

	public static List<SecondClassification> getClassification(String primaryClassification) throws SQLException {
		List<SecondClassification> list = new ArrayList<SecondClassification>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(
				"select * from second_classification where primary_classification = '"
		+ primaryClassification + "'");
		while (rs.next()) {
			SecondClassification secondClassifition = new SecondClassification();
			secondClassifition.setId(rs.getInt("id"));
			secondClassifition.setName(rs.getString("name"));
			secondClassifition.setPrimaryClassifition(rs.getString("primary_classification"));
			list.add(secondClassifition);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return list;
	}
	
	public static SecondClassification getClassification(String name,
			String primaryClassification) throws SQLException {
		SecondClassification secondClassification = new SecondClassification();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery(
				"select * from second_classification where primary_classification = '" 
		+ primaryClassification + "' and name = '"+name+"'");
		while (rs.next()) {
			secondClassification.setId(rs.getInt("id"));
			secondClassification.setName(rs.getString("name"));
			secondClassification.setPrimaryClassifition(rs.getString("primary_classification"));
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return secondClassification;
	}
}
