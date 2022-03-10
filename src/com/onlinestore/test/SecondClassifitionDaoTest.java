package com.onlinestore.test;

import java.sql.SQLException;

import com.onlinestore.dao.SecondClassificationDao;

import junit.framework.TestCase;

public class SecondClassifitionDaoTest extends TestCase {

	public SecondClassifitionDaoTest() {
		// TODO Auto-generated constructor stub
	}

	public SecondClassifitionDaoTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void testAdd() {
		try {
			int rows = SecondClassificationDao.add("≤‚ ‘", "≤‚ ‘");
			System.out.println(rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
