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
 * Servlet implementation class AddBalanceController
 */
public class AddBalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
				HttpSession session = request.getSession();
		CustomerBean customerBean = (CustomerBean) session.getAttribute("customerBean");
		int id = customerBean.getId();
		String email = customerBean.getEmail();
		int amount = Integer.parseInt(request.getParameter("balance"));
		int balance = Integer.parseInt(request.getParameter("balance")) + customerBean.getBalance();

		if(CustomerDao.addBalance(balance,email)) {
			System.out.println("addbalance");
			if(CustomerDao.transactionRecorder(amount,email)) {
				System.out.println("TransactionRecorder");
			}
			else {
				System.out.println("Not Recoder");
			}
			response.sendRedirect("MainCustomer");
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
