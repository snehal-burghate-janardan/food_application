package com.ty.foodie_application_jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.foodie_application_jsp.dao.UserDao;
import com.ty.foodie_application_jsp.dto.User;

@WebServlet("/login")
public class UserLoginController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		UserDao userDao=new UserDao();
		User user= userDao.loginUserByEmail(email);
		
		if(user.getPassword().equals(password)) {
			
			if(user.getRole().equals("Manager")) {
				
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("displaymenu.jsp");
				requestDispatcher.forward(req, resp);
					
			}
			
			else if(user.getRole().equals("Staff")) {
				
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("displaymenulist.jsp");
				requestDispatcher.forward(req, resp);
					
				
			}
			else if(user.getRole().equals("Customer")) {
				
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("orderdetails.jsp");
				requestDispatcher.forward(req, resp);
					
				
			}
		}
		
	}
}
