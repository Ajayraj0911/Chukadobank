package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.CustomerBean;
import com.dao.CustomerDao;

/**
 * Servlet implementation class MainCustomer
 */
public class MainCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		CustomerBean customerBean = (CustomerBean) session.getAttribute("customerBean");
		String Email = customerBean.getEmail();
		List<CustomerBean> customerList = new CustomerDao().getAllCustomers();
		for(int i = 0; i<customerList.size(); i++) {
			
			customerBean = customerList.get(i);
			String enteredEmail = customerBean.getEmail();
		
			if(enteredEmail.equals(Email))
			{
				session.setAttribute("customerBean", customerBean);  
				int balance = customerBean.getBalance();
				session.setAttribute("balance", balance);
				response.sendRedirect("paymentsuccessfull.jsp");
			}
			else
			{
//				out.print("<b style="color: white;">");
//				out.print("<b style="color: white;">LOGIN FAILED</b>");
//				request.getRequestDispatcher("Register.jsp").include(request, response);
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
