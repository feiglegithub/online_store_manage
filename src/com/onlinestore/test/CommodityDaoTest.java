package com.onlinestore.test;

import java.sql.SQLException;
import java.util.List;

import com.onlinestore.dao.CommodityDao;
import com.onlinestore.domain.Commodity;

import junit.framework.TestCase;

public class CommodityDaoTest extends TestCase {

	public CommodityDaoTest() {
		// TODO Auto-generated constructor stub
	}

	public CommodityDaoTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void testGetAll() {
		try {
			List<Commodity> list = CommodityDao.getAll(1,30);
			for (Commodity commodity : list) {
				String imgs = commodity.getImgs();
				System.out.println(imgs);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testGetRows() throws SQLException {
		int rows = CommodityDao.getRows("Ò©Æ·", "½ø¿ÚÒ©");
		System.out.println(Math.ceil(rows/30.0));
	}
}
