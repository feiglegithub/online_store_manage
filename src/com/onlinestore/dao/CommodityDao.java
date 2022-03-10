package com.onlinestore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.onlinestore.domain.Commodity;
import com.onlinestore.domain.PrimaryClassification;
import com.onlinestore.tools.JDBCUtils;

public class CommodityDao {

	public CommodityDao() {
		// TODO Auto-generated constructor stub
	}

	public static List<Commodity> getAll(int page,int rows) throws SQLException {
		List<Commodity> list = new ArrayList<Commodity>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from commodity limit "+page*rows+","+rows);
		while (rs.next()) {
			Commodity commodity = new Commodity();
			commodity.setDescription(rs.getString("description"));
			commodity.setId(rs.getInt("id"));
			commodity.setImgs(rs.getString("imgs"));
			commodity.setName(rs.getString("name"));
			commodity.setPrimaryClassification(rs.getString("primary_classification"));
			commodity.setSecondClassification(rs.getString("second_classification"));
			commodity.setPrice(rs.getDouble("price"));
			list.add(commodity);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return list;
	}
	
	public static List<Commodity> get(String primaryClassification,int page,int rows) throws SQLException {
		List<Commodity> list = new ArrayList<Commodity>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from commodity where primary_classification "
				+ "= '"+primaryClassification+"' limit "+page*rows+","+rows);
		while (rs.next()) {
			Commodity commodity = new Commodity();
			commodity.setDescription(rs.getString("description"));
			commodity.setId(rs.getInt("id"));
			commodity.setImgs(rs.getString("imgs"));
			commodity.setName(rs.getString("name"));
			commodity.setPrimaryClassification(rs.getString("primary_classification"));
			commodity.setSecondClassification(rs.getString("second_classification"));
			commodity.setPrice(rs.getDouble("price"));
			list.add(commodity);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return list;
	}
	
	public static List<Commodity> getByName(String name) throws SQLException {
		List<Commodity> list = new ArrayList<Commodity>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from commodity where name like '%"+name+"%'");
		while (rs.next()) {
			Commodity commodity = new Commodity();
			commodity.setDescription(rs.getString("description"));
			commodity.setId(rs.getInt("id"));
			commodity.setImgs(rs.getString("imgs"));
			commodity.setName(rs.getString("name"));
			commodity.setPrimaryClassification(rs.getString("primary_classification"));
			commodity.setSecondClassification(rs.getString("second_classification"));
			commodity.setPrice(rs.getDouble("price"));
			list.add(commodity);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return list;
	}
	
	public static int getRows(String primaryClassification,
			String secondClassification) throws SQLException {
		int rows = 0;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select count(id) from commodity where primary_classification "
				+ "= '"+primaryClassification+"' and second_classification = '"
				+secondClassification+"'");
		while (rs.next()) {
			rows = rs.getInt(1);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return rows;
	}
	
	public static int getRows(String primaryClassification) throws SQLException {
		int rows = 0;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select count(id) from commodity where primary_classification "
				+ "= '"+primaryClassification+"'");
		while (rs.next()) {
			rows = rs.getInt(1);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return rows;
	}
	
	public static int getRows() throws SQLException {
		int rows = 0;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select count(id) from commodity");
		while (rs.next()) {
			rows = rs.getInt(1);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return rows;
	}
	
	public static List<Commodity> get(String primaryClassification,
			String secondClassification,int page,int rows) throws SQLException {
		List<Commodity> list = new ArrayList<Commodity>();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from commodity where primary_classification "
				+ "= '"+primaryClassification+"' and second_classification = '"
				+secondClassification+"' limit "+page*rows+","+rows);
		while (rs.next()) {
			Commodity commodity = new Commodity();
			commodity.setDescription(rs.getString("description"));
			commodity.setId(rs.getInt("id"));
			commodity.setImgs(rs.getString("imgs"));
			commodity.setName(rs.getString("name"));
			commodity.setPrimaryClassification(rs.getString("primary_classification"));
			commodity.setSecondClassification(rs.getString("second_classification"));
			commodity.setPrice(rs.getDouble("price"));
			list.add(commodity);
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return list;
	}
	
	public static Commodity get(int id) throws SQLException {
		Commodity commodity = new Commodity();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rs = stmt.executeQuery("select * from commodity where id ="+id);
		while (rs.next()) {
			commodity.setDescription(rs.getString("description"));
			commodity.setId(rs.getInt("id"));
			commodity.setImgs(rs.getString("imgs"));
			commodity.setName(rs.getString("name"));
			commodity.setPrimaryClassification(rs.getString("primary_classification"));
			commodity.setSecondClassification(rs.getString("second_classification"));
			commodity.setPrice(rs.getDouble("price"));
		}
		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();
		if (rs != null)
			rs.close();

		return commodity;
	}

	public static int delet(int id) throws SQLException {
		int rows = 0;
		String sql = "delete from commodity where id = "+id;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(sql);

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
	
	public static int update(int id,String fileNames) throws SQLException {
		int rows = 0;
		String sql = "update commodity set imgs = '"+fileNames+"' where id = "+id;
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(sql);

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
	
	public static int update(String describe,int id,String imgs,double price,
			String primaryClassification,String secondClassification,String name) throws SQLException {
		int rows = 0;
		String sql = "update commodity set description = '"+describe+"',imgs = '"+imgs+"'"
				+ ",price="+price+",primary_classification = '"+primaryClassification+"',"
						+ "second_classification = '"+secondClassification+"',name = '"+name+"' where id = "+id;
//		System.out.println(sql);
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(sql);

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}
	
	public static int add(String name, String primaryClassification, String secondClassification, String describe,
			String imgs,double price) throws SQLException {
		int rows = 0;
		String sql = "insert into commodity(name,`primary_classification`,"
				+ "`second_classification`,`description`,`imgs`,`price`) values('" + name + "'," + "'" + primaryClassification
				+ "','" + secondClassification + "'," + "'" + describe + "','" + imgs 
				+ "',"+price+")";
//		System.out.println(sql);
		Connection conn = null;
		Statement stmt = null;
		conn = JDBCUtils.getConn();
		stmt = conn.createStatement();
		rows = stmt.executeUpdate(sql);

		if (conn != null)
			conn.close();
		if (stmt != null)
			stmt.close();

		return rows;
	}

}
