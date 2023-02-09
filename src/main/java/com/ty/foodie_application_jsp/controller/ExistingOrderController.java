package com.ty.foodie_application_jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.foodie_application_jsp.dao.FoodOrderDao;
import com.ty.foodie_application_jsp.dto.FoodOrder;
import com.ty.foodie_application_jsp.dto.Items;
@WebServlet("/existingorderdetails")
public class ExistingOrderController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id= Integer.parseInt(req.getParameter("id"));
		
		FoodOrderDao foodOrderDao=new FoodOrderDao();
		FoodOrder foodOrder=foodOrderDao.getFoodOrderByEmail(id);
		if(foodOrder!=null) {
			List<Items> list=foodOrder.getItemsList();
			//req.setAttribute("foodOrder", foodOrder);
			req.setAttribute("itemlist", list);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("displayexistingorderdetails.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
