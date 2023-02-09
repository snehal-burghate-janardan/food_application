package com.ty.foodie_application_jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.foodie_application_jsp.dao.ItemsDao;
import com.ty.foodie_application_jsp.dto.Items;


@WebServlet("/deleteitem")
public class DeleteItemController extends HttpServlet{
	//static Items items;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		ItemsDao itemsDao=new ItemsDao();
//		Items items2=itemsDao.getItemsById(id);
//		DisplayAddedItemsController.list.remove(items2);
		
		
		boolean result=itemsDao.deleteItems(id);
		 if(result) {
			
		
			 List<Items> list= itemsDao.getAllItems();
			 req.setAttribute("list", list);
			 RequestDispatcher requestDispatcher=req.getRequestDispatcher("displayaddeditems.jsp");
			requestDispatcher.include(req, resp);
		 }
		
		
		
	}

}
