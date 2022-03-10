package com.onlinestore.servlet.file;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.onlinestore.dao.CommodityDao;

public class Delete extends HttpServlet {

	/**
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;chartset=utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		
		String path = request.getServletContext().getRealPath("./")+"/img/";
		
		String name = request.getParameter("name");
		int id = Integer.parseInt(request.getParameter("id"));
		String fileNames = request.getParameter("fileNames");
		
		JSONObject jsonObject = new JSONObject();
		try {
			File file = new File(path+name);
			boolean flag =  file.delete();
			jsonObject.put("status", flag);
			jsonObject.put("message", name+"É¾³ý£º"+flag);
			
			CommodityDao.update(id, fileNames);
		} catch (Exception e) {
			jsonObject.put("status", false);
			jsonObject.put("message", "É¾³ýÊ§°Ü£º"+e.getMessage());
		}
		out.print(jsonObject);
	}

}
