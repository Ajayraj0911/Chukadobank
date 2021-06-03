package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.CustomerBean;
import com.dao.CustomerDao;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session= request.getSession();		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		List<CustomerBean> customerList = new CustomerDao().getAllCustomers();
		for(int i = 0; i<customerList.size(); i++) {
			CustomerBean customerBean = new CustomerBean();
			customerBean = customerList.get(i);
			String enteredEmail = customerBean.getEmail();
			String enteredPassword = customerBean.getPassword();
			System.out.println(email);
			System.out.println(password);
			System.out.println(enteredEmail);
			System.out.println(enteredPassword);
			if(enteredEmail.equals(email) && enteredPassword.equals(password))
			{
				System.out.println("Login Successfull");
				session.setAttribute("customerBean", customerBean);  
				int balance = customerBean.getBalance();
				session.setAttribute("balance", balance);
				response.sendRedirect("AddBalance.jsp");
			}
			else
			{
				System.out.println("Login Failed");
			}
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
