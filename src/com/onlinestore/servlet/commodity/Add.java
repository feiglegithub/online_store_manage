package com.onlinestore.servlet.commodity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.onlinestore.service.CommodityService;

public class Add extends HttpServlet {

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

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String imgs = request.getParameter("fileNams");
		String name = request.getParameter("name");
		String primaryClassification = request.getParameter("primary");
		String secondClassification = request.getParameter("second");
		String describe = request.getParameter("describe");
		double price = Double.parseDouble(request.getParameter("price"));
		
		JSONObject jsonObject = CommodityService.add(name, primaryClassification, 
				secondClassification, describe, imgs,price);
		out.print(jsonObject);
	}

}
