package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.CustomerBean;
import com.dao.CustomerDao;

/**
 * Servlet implementation class AddCustomerController
 */
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		int min = 1000;  
		int max = 9999;  
		int id=(int)(Math.random()*(max-min+1)+min);
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String password=request.getParameter("password");
		CustomerDao customerdao = new CustomerDao();
		CustomerBean customerbean = new CustomerBean();
		customerbean.setName(name);
		customerbean.setAddress(address);
		customerbean.setId(id);
		customerbean.setEmail(email);
		customerbean.setPassword(password);
		customerbean.setBalance(0);
		session.setAttribute("customerBean", customerbean);
		if(customerdao.addEmployee(customerbean)) {
			System.out.println("Added");
			response.sendRedirect("index.jsp");
		}
		else {
			System.out.println("Failed");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
