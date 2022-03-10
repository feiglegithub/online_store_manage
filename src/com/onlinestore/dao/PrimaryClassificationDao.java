package com.onlinestore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlinestore.domain.PrimaryClassification;
import com.onlinestore.tools.JDBCUtils;

public class PrimaryClassificationDao {

	public PrimaryClassificationDao() {
		// TODO Auto-generated constructor stub
	}

	public static List<PrimaryClassification> getAllClassification() {
		List<PrimaryClassification> list = new ArrayList<PrimaryClassification>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtils.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from primary_classification");
			while (rs.next()) {
				PrimaryClassification primaryClassifition = new PrimaryClassification();
				primaryClassifition.setId(rs.getInt("id"));
				primaryClassifition.setName(rs.getString("name"));
				list.add(primaryClassifition);
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

	public static PrimaryClassification getClassification(String name) {
		PrimaryClassification primaryClassifition = new PrimaryClassification();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = JDBCUtils.getConn();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from primary_classification where name = '" + name + "'");
			while (rs.next()) {
				primaryClassifition.setId(rs.getInt("id"));
				primaryClassifition.setName(rs.getString("name"));
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
		return primaryClassifition;
	}

	public static int add(String name) throws SQLException {
		int rows = 0;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate("insert into primary_classification(name) values('" + name + "')");

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
	
	public static int delete(String classification) throws SQLException {
		int rows = 0;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate("delete from primary_classification where name = '"
		+classification+"'");

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
}
