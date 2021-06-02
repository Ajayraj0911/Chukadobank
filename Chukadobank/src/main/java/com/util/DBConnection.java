package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String userName = "wemcyjqbubjccr";
	private static String password = "b2a032e3d0f779c60202ce30cd2e387573a737811356a83479db29a664c63197";
	private static String connectionURL = "jdbc:postgresql://ec2-54-145-224-156.compute-1.amazonaws.com:5432/dengmtldb1u5f5?sslmode=require";
	private static String driverClass = "org.postgresql.Driver";

	public static Connection getDBConnection() {

		Connection conn = null;

		try {
			Class.forName(driverClass);

			conn = DriverManager.getConnection(connectionURL, userName, password);

			if (conn != null) {

				System.out.println("connected to db..");
			} else {

				System.out.println("not connected to db..");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;

	}

	public static void main(String[] args) {

		DBConnection.getDBConnection();
		System.out.print("Hello Himang");
	}

}