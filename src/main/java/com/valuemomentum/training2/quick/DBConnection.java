package com.valuemomentum.training2.quick;


	import java.sql.Connection;
	import java.sql.DriverManager;
	//import java.sql.SQLException;

	public class DBConnection {
		public static Connection conn=null;
		
		public static Connection getConnection(){

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");


				//System.out.println("connecting to database...");

				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickrecords", "root", "Mrdy@1234");

				if (conn != null) {
					System.out.println("  ");
				}
				
				
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			return conn;
			}
		}


