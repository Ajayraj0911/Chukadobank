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
 * Servlet implementation class NetBankingController
 */
public class NetBankingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		CustomerBean customerBean = (CustomerBean) session.getAttribute("customerBean");
		int a = customerBean.getBalance();
		int b = 0;
		int totallya = 0;
		int totallyb = 0;
		int amount = Integer.parseInt(request.getParameter("balance"));
		String bemail = request.getParameter("email");
		String aemail = customerBean.getEmail();
		List<CustomerBean> customerList = new CustomerDao().getAllCustomers();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		
		for(int i = 0; i<customerList.size(); i++) {
			CustomerBean customerBean1 = new CustomerBean();
			customerBean1 = customerList.get(i);
			String dbemail = customerBean1.getEmail();
			if(bemail.equals(dbemail)) {
				b = customerBean1.getBalance();
				System.out.println(b);
				totallya = a - amount;
				totallyb = b + amount;
				amount = 0 - amount;
				if(CustomerDao.addBalance(totallya,aemail)) {
					System.out.println("addbalance");
					if(CustomerDao.transactionRecorder(amount,aemail)) {
						System.out.println("TransactionRecorder");
					}
					else {
						System.out.println("Not Recoder");
					}
				}
				amount = 0 -  amount;
				if(CustomerDao.addBalance(totallyb,bemail)) {
					System.out.println("addbalance");
					if(CustomerDao.transactionRecorder(amount,bemail)) {
						System.out.println("TransactionRecorder");
					}
					else {
						System.out.println("Not Recoder");
					}
					response.sendRedirect("MainCustomer");
				}
				
			}
			else {
				out.print("LOGIN FAILED");
				request.getRequestDispatcher("NetBanking.jsp").include(request, response);
				break;

			}
		}


		out.print("</body></html>");
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
