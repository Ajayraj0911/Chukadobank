package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.bean.CustomerBean;
import com.util.DBConnection;

public class CustomerDao {

	static Connection conn = (Connection) DBConnection.getDBConnection();
	static PreparedStatement stmt;

	public boolean addEmployee(CustomerBean customerbean) {
		boolean flag = false;
		String insertQuery = "insert into customer values (?,?,?,?,?,?);";
		try {
			stmt = (PreparedStatement) conn.prepareStatement(insertQuery);
			stmt.setInt(1,customerbean.getId());
			stmt.setString(2,customerbean.getName());
			stmt.setString(3,customerbean.getEmail());
			stmt.setString(4,customerbean.getAddress());
			stmt.setString(6,customerbean.getPassword());
			stmt.setInt(5,customerbean.getBalance());

			 int res = stmt.executeUpdate();
			 
			 if(res>0) {
				 
				 flag = true;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	public List<CustomerBean> getAllCustomers() {

		Connection conn = DBConnection.getDBConnection();
		List<CustomerBean> customers = new ArrayList<>();
		if (conn != null) {

			try {
				PreparedStatement pstmt = conn.prepareStatement("select * from customer");
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				while (rs.next()) {

					CustomerBean customerBean = new CustomerBean();
					customerBean.setId(rs.getInt(1));
					customerBean.setName(rs.getString(2));
					customerBean.setEmail(rs.getString(3));
					customerBean.setAddress(rs.getString(4));
					customerBean.setPassword(rs.getString(6));
					customerBean.setBalance(rs.getInt(5));
					customers.add(customerBean);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return customers;
	}
	
//	
//	  public List<CustomerBean> getAllTransaction() {
//	  
//	  Connection conn = DBConnection.getDBConnection(); List<CustomerBean>
//	  transaction = new ArrayList<>(); if (conn != null) {
//	  
//	  try { PreparedStatement pstmt =
//	  conn.prepareStatement("select * from transaction"); ResultSet rs =
//	  (ResultSet) pstmt.executeQuery(); while (rs.next()) {
//	  
//	  CustomerBean customerBean = new CustomerBean();
//	  customerBean.setDate(rs.getString(1)); customerBean.setAmount(rs.getInt(2));
//	  customerBean.setTid(rs.getInt(3)); transaction.add(customerBean); }
//	  
//	  } catch (SQLException e) { // TODO Auto-generated catch block
//	  e.printStackTrace(); }
//	  
//	  } return transaction; }
//	 
	public List<CustomerBean> getAllTransaction(String from, String to,String email) {
		PreparedStatement pstmt;
		Connection conn = DBConnection.getDBConnection();
		List<CustomerBean> transaction = new ArrayList<>();
		System.out.print(from);
		if (conn != null) {
			try {
				if(from == null) {
					pstmt = conn.prepareStatement("select * from transaction where email = '"+email+"';");
				}
				else {
					pstmt = conn.prepareStatement("select * from transaction where date > '" + from +"' and date < '" + to + "' and email = '"+email+"';");
				}
				
//				pstmt.setString(1,from);
//				pstmt.setString(2,to);
				ResultSet rs = (ResultSet) pstmt.executeQuery();
				while (rs.next()) {

					CustomerBean customerBean = new CustomerBean();
					customerBean.setDate(rs.getString(1));
					customerBean.setAmount(rs.getInt(2));	
					customerBean.setTid(rs.getInt(3));									
					transaction.add(customerBean);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return transaction;
	}
	public static boolean addBalance(int balance,String email) {
		boolean flag = false;
		String insertQuery = "update customer set balance = '" + balance + "' where email = '" + email + "';";
		try {
			stmt = (PreparedStatement) conn.prepareStatement(insertQuery);
			
			 int res = stmt.executeUpdate();
			 
			 if(res>0) {
				 
				 flag = true;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
	public static boolean transactionRecorder(int amount,String email) {
		int min = 10000;  
		int max = 99999;  
		int Tid=(int)(Math.random()*(max-min+1)+min);
		System.out.println("Above date");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    	   	LocalDateTime now = LocalDateTime.now(); 
       		String abc = dtf.format(now);
//       		Date date123=Date.valueOf(date);
		boolean flag = false;
		String insertQuery = "insert into transaction values (?,?,?,?);";
		try {
			System.out.println("in try method");
			stmt = (PreparedStatement) conn.prepareStatement(insertQuery);
			stmt.setInt(2,amount);
			stmt.setString(1,abc);
			stmt.setString(4,email);
			System.out.println("after pstmt");
			stmt.setInt(3,Tid);

			 int res = stmt.executeUpdate();
			 System.out.println("brfore if res");
			 if(res>0) {
				 
				 flag = true;
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return flag;
	}
}
