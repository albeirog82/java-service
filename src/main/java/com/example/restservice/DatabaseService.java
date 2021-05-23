package com.example.restservice;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService {
	
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if(connection != null)
			return connection;
		else {
			try{

				//Choose the driver
				//String driver = "com.mysql.jdbc.Driver";
				String url = "";
				String user = "";
				String password = "";
				
				//Section to identify the current machine 
				InetAddress addr;
				try {
					String hostname = "Unknown"; 
					addr = InetAddress.getLocalHost();
					hostname = addr.getHostName();
					System.out.println("Hostname: " + hostname);
					
					url = "jdbc:postgresql://kms-beyond.chqtvlyzu9ve.us-east-2.rds.amazonaws.com:5432/kms?autoReconnect=true";  //desa
					user = "postgres";    //desa
					password = "kms2021db";    //desa
					
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
 				//Class.forName(driver);
 				System.out.println(url);
				connection = DriverManager.getConnection(url, user, password);
            //} catch (ClassNotFoundException e) {
            //    e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
			
			
			return connection;	
		}
	}
	
	
	DatabaseService(){
		
	}

}
