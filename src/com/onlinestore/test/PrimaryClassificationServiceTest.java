package com.onlinestore.test;

import com.alibaba.fastjson.JSONObject;
import com.onlinestore.service.PrimaryClassificationService;

import junit.framework.TestCase;

public class PrimaryClassificationServiceTest extends TestCase {

	public PrimaryClassificationServiceTest() {
		// TODO Auto-generated constructor stub
	}

	public PrimaryClassificationServiceTest(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void testAddClassifition() {
		JSONObject jsonObject = PrimaryClassificationService.addClassification("test");
		System.out.println(jsonObject);
	}
}
