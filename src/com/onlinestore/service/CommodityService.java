package com.onlinestore.service;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.onlinestore.dao.CommodityDao;
import com.onlinestore.domain.Commodity;

public class CommodityService {

	private static double rows = 10.0;
	
	public CommodityService() {
		// TODO Auto-generated constructor stub
	}

	public static JSONObject add(String name,String primaryClassification,String secondClassification
			,String describe,String imgs,double price) {
		JSONObject jsonObject = new JSONObject();
		try {
			int rows = CommodityDao.add(name, primaryClassification, 
					secondClassification, describe, imgs,price);
			if(rows>0) {
				jsonObject.put("status", true);
				jsonObject.put("message", "�����ɹ�");
			}else {
				jsonObject.put("status", false);
				jsonObject.put("message", "����ʧ��");
			}
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "����ʧ�ܣ�"+e.getMessage());
		}
		return jsonObject;
	}
	
	public static JSONObject update(int id,String name,String primaryClassification,String secondClassification
			,String describe,String imgs,double price) {
		JSONObject jsonObject = new JSONObject();
		try {
			int rows = CommodityDao.update(describe, id, imgs, price, 
					primaryClassification, secondClassification,name);
			if(rows>0) {
				jsonObject.put("status", true);
				jsonObject.put("message", "���³ɹ�");
			}else {
				jsonObject.put("status", false);
				jsonObject.put("message", "����ʧ��");
			}
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "����ʧ�ܣ�"+e.getMessage());
		}
		return jsonObject;
	}
	
	public static JSONObject getAll(int page) {
		JSONObject jsonObject = new JSONObject();
		try {
			List<Commodity> list =  CommodityDao.getAll(page-1,(int)rows);
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("data", (JSONArray)JSON.toJSON(list));
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getByName(String name) {
		JSONObject jsonObject = new JSONObject();
		try {
			List<Commodity> list =  CommodityDao.getByName(name);
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("data", (JSONArray)JSON.toJSON(list));
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject get(String primaryClassification,int page) {
		JSONObject jsonObject = new JSONObject();
		try {
			List<Commodity> list =  CommodityDao.get(primaryClassification,page-1,(int)rows);
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("data", (JSONArray)JSON.toJSON(list));
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject get(int id) {
		JSONObject jsonObject = new JSONObject();
		try {
			Commodity commodity =  CommodityDao.get(id);
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("data", commodity);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject get(String primaryClassification,
			String secondClassification,int page) {
		JSONObject jsonObject = new JSONObject();
		try {
			List<Commodity> list =  CommodityDao.get(primaryClassification,
					secondClassification,page-1,(int)rows);
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("data", (JSONArray)JSON.toJSON(list));
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getPages(String primaryClassification,
			String secondClassification) {
		JSONObject jsonObject = new JSONObject();
		try {
			int count =  CommodityDao.getRows(primaryClassification,secondClassification);
			int pages = (int)Math.ceil(count/rows);
			
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("pages", pages);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getRows(String primaryClassification,
			String secondClassification) {
		JSONObject jsonObject = new JSONObject();
		try {
			int count =  CommodityDao.getRows(primaryClassification,secondClassification);
			
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("rows", count);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getPages(String primaryClassification) {
		JSONObject jsonObject = new JSONObject();
		try {
			int count =  CommodityDao.getRows(primaryClassification);
			int pages = (int)Math.ceil(count/rows);
			
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("pages", pages);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getRows(String primaryClassification) {
		JSONObject jsonObject = new JSONObject();
		try {
			int count =  CommodityDao.getRows(primaryClassification);
			
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("rows", count);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getPages() {
		JSONObject jsonObject = new JSONObject();
		try {
			int count =  CommodityDao.getRows();
			int pages = (int)Math.ceil(count/rows);
			
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("pages", pages);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject getRows() {
		JSONObject jsonObject = new JSONObject();
		try {
			int count =  CommodityDao.getRows();
			
			jsonObject.put("status", true);
			jsonObject.put("message", "");
			jsonObject.put("rows", count);
		} catch (SQLException e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "�쳣��"+e.getMessage());
			jsonObject.put("data", "");
		}
		return jsonObject;
	}
	
	public static JSONObject delete(int id,String path) {
		JSONObject jsonObject = new JSONObject();
		try {
			Commodity commodity = CommodityDao.get(id);
			
			int rows = CommodityDao.delet(id);
			
			String imgStr = commodity.getImgs();
			String[] imgs = imgStr.split(",");
			for (String img : imgs) {
				File file = new File(path+img);
				file.delete();
			}
			
			if(rows>0) {
				jsonObject.put("status", true);
				jsonObject.put("message", "ɾ���ɹ�");
			}else {
				jsonObject.put("status", false);
				jsonObject.put("message", "ɾ��ʧ��");
			}
		} catch (Exception e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "ɾ��ʧ�ܣ�"+e.getMessage());
		}
		return jsonObject;
	}
}
