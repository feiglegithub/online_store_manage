package com.onlinestore.service;

import java.sql.SQLException;

import com.alibaba.fastjson.JSONObject;
import com.onlinestore.dao.PrimaryClassificationDao;
import com.onlinestore.dao.SecondClassificationDao;
import com.onlinestore.domain.PrimaryClassification;

public class PrimaryClassificationService {

	public PrimaryClassificationService() {
		// TODO Auto-generated constructor stub
	}

	public static JSONObject addClassification(String name) {

		PrimaryClassification primaryClassifition = PrimaryClassificationDao.getClassification(name);

		JSONObject jsonObject = new JSONObject();

		if (primaryClassifition.getName() == null) {

			try {
				int rows = PrimaryClassificationDao.add(name);
				if (rows > 0) {
					jsonObject.put("status", true);
					jsonObject.put("message", "�����ɹ�");
				}
				else {
					jsonObject.put("status", false);
					jsonObject.put("message", "����ʧ��");
				}
					
			} catch (SQLException e) {
				jsonObject.put("status", false);
				jsonObject.put("message", e.getMessage());
			}
		} else {
			jsonObject.put("status", false);
			jsonObject.put("message", "�����Ѿ�����");
		}
		
		return jsonObject;
	}

	public static JSONObject deleteClassification(String classifition) {
		JSONObject jsonObject = new JSONObject();
		try {
			int rows = PrimaryClassificationDao.delete(classifition);
			if(rows>0) {
				SecondClassificationDao.deleteByPrimaryClassification(classifition);
				
				jsonObject.put("status", true);
				jsonObject.put("message", "ɾ���ɹ�");
			}else {
				jsonObject.put("status", false);
				jsonObject.put("message", "ɾ��ʧ��");
			}
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", e.getMessage());
		}
		return jsonObject;
	}
}
