package com.onlinestore.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.onlinestore.domain.Users;
import com.onlinestore.tools.JDBCUtils;

public class UsersDao {

	public UsersDao() {
		// TODO Auto-generated constructor stub
	}

	public static Users getUsers(String name, String psw) {
		Connection conn = null;
		Statement stmt = null;
		
		Users users = new Users();
		try {
			conn = JDBCUtils.getConn();
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from users where name = '" + name + "' and psw = '" + psw + "'");
			while(rs.next()) {
				users.setID(rs.getInt("id"));
				users.setNAME(rs.getString("name"));
				users.setPSW(rs.getString("psw"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null)
					conn.close();
				if(stmt!=null)
					stmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return users;
	}
}
