package com.onlinestore.test;

import com.alibaba.fastjson.JSONObject;
import com.onlinestore.service.CommodityService;

import junit.framework.TestCase;

public class CommodityServiceTest extends TestCase {
	public void testGetPages() {
		JSONObject jsonObject = CommodityService.getPages();
		System.out.println(jsonObject);
	}
}
