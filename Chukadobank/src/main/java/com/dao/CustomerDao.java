package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	public List<CustomerBean> getAllTransaction(String from, String to) {

		Connection conn = DBConnection.getDBConnection();
		List<CustomerBean> transaction = new ArrayList<>();
		System.out.print(from);
		if (conn != null) {

			try {
				PreparedStatement pstmt = conn.prepareStatement("select * from transaction where date > '" + from +"' and date < '" + to + "';");
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
	public static boolean addBalance(int balance,int id) {
		boolean flag = false;
		String insertQuery = "update customer set balance = '" + balance + "' where id = '" + id + "';";
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
	
}
