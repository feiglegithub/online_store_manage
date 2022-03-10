package com.onlinestore.service;

import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.onlinestore.dao.SecondClassificationDao;
import com.onlinestore.domain.SecondClassification;

public class SecondClassificationService {

	public SecondClassificationService() {
		// TODO Auto-generated constructor stub
	}

	public static JSONObject getClassification(String primaryClassification) {
		JSONObject jsonObject = new JSONObject();
		try {
			List<SecondClassification> list = 
					SecondClassificationDao.getClassification(primaryClassification);
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("list", list);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", e.getMessage());
			jsonObject.put("list", null);
		}
		return jsonObject;
	}
	
	public static JSONObject add(String name,String primaryClassification) {
		JSONObject jsonObject = new JSONObject();
		try {
			SecondClassification secondClassifition = 
					SecondClassificationDao.getClassification(name, primaryClassification);
			if(secondClassifition.getName()==null) {
				int rows = SecondClassificationDao.add(name, primaryClassification);
				if(rows>0) {
					jsonObject.put("status", true);
					jsonObject.put("message", "二级分类新增成功");
				}else {
					jsonObject.put("status", false);
					jsonObject.put("message", "新增失败");
				}
			}else {
				jsonObject.put("status", false);
				jsonObject.put("message", "二级分类已经存在");
			}
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", e.getMessage());
		}
		return jsonObject;
	}
	
	public static JSONObject delete(int id) {
		JSONObject jsonObject = new JSONObject();
		try {
			int rows = SecondClassificationDao.delete(id);
			if(rows>0) {
				jsonObject.put("status", true);
				jsonObject.put("message", "删除成功");
			}else {
				jsonObject.put("status", false);
				jsonObject.put("message", "删除失败");
			}
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", e.getMessage());
		}
		return jsonObject;
	}
}
