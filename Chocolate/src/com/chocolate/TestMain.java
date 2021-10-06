package com.chocolate;

import java.sql.*;

public class TestMain {
public static void main(String args[]) {
	String url="jdbc:mysql://localhost:3306/CHOCOLATE";
	String userName="root";
	String password="Aishusushma@57";
	String insert="insert into  CHOCOLATE.CHOCOLATES VALUES(12 ,'KITKAT1','1992','USA','888888','GUD')";
	String update="update CHOCOLATE.CHOCOLATES SET REVIEW='BAD' WHERE ID=2";
	
	try {
		
	//Driver mysqlDriver=new Driver();	
	//DriverManager.registerDriver(mysqlDriver);
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection =DriverManager.getConnection(url,userName,password);
	System.out.println("connection is succeed "+url+" " +password);
	Statement statement=connection.createStatement();
	statement.executeUpdate(update);
	System.out.println("updated a column");
	
	}
	catch(SQLException sqlException){
		System.out.println(sqlException.getMessage());
		
	}
	catch(Exception classNotFoundException) {
		System.out.println(classNotFoundException.getMessage());
		
	}
	
}
}