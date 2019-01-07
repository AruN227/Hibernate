package com.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
	public static void main(String args[]) {
		String url = "jdbc:mysql://arunhopvinna.c4yx4tg6eu9a.us-east-2.rds.amazonaws.com:36/hb-01-one-to-one-uni";
		String user = "arunhopvinna";
		String password = "Qwerty123";
		
		try {
			
			System.out.println("Connected to" +url);
			
			Connection connection = DriverManager.getConnection(url,user,password);
			
			System.out.println("Connection Successul");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
