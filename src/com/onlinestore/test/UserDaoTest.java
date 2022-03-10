package com.onlinestore.test;

import com.onlinestore.dao.UsersDao;
import com.onlinestore.domain.Users;

import junit.framework.TestCase;

public class UserDaoTest extends TestCase {

	public UserDaoTest() {
		// TODO Auto-generated constructor stub
	}

	public UserDaoTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void testGetUsers() {
		Users users = UsersDao.getUsers("1", "2");
		System.out.println("name:"+users.getNAME());
	}
}
