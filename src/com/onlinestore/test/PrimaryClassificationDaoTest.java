package com.onlinestore.test;

import com.onlinestore.dao.PrimaryClassificationDao;
import com.onlinestore.domain.PrimaryClassification;

import junit.framework.TestCase;

public class PrimaryClassificationDaoTest extends TestCase {

	public PrimaryClassificationDaoTest() {
		// TODO Auto-generated constructor stub
	}

	public PrimaryClassificationDaoTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void testGetClassification() {
		PrimaryClassification primaryClassifition = 
				PrimaryClassificationDao.getClassification("s");
		System.out.println(primaryClassifition.getName());
	}
}
