package com.chocolate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChocolateImplement implements ChocolateD{

	@Override
	public void insert() {
		String url="jdbc:mysql://localhost:3306/CHOCOLATE";
		String userName="root";
		String password="Aishusushma@57";

		String insert="insert into  CHOCOLATE.CHOCOLATES VALUES(21,'KITKAT3','1983','US','888879','GUD')";
		try {
			
		//Driver mysqlDriver=new Driver();	
		//DriverManager.registerDriver(mysqlDriver);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("connection is succeed "+url+" " +password);
		Statement statement=connection.createStatement();
		statement.executeUpdate(insert);
		System.out.println("inserted");
		
		}
		catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
			
		}
		catch(Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			
		}
		
	}
	

	@Override
	public void update() {
		String url="jdbc:mysql://localhost:3306/CHOCOLATE";
		String userName="root";
		String password="Aishusushma@57";

		String update="update CHOCOLATE.CHOCOLATES SET REVIEW='BAD' WHERE ID=21";
		try {
			
		//Driver mysqlDriver=new Driver();	
		//DriverManager.registerDriver(mysqlDriver);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("connection is succeed "+url+" " +password);
		Statement statement=connection.createStatement();
		statement.executeUpdate( update);
		System.out.println(" updated");
		
		}
		catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
			
		}
		catch(Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			
		}
		
	}
		
		
	
	

	@Override
	public void read() {
		String url="jdbc:mysql://localhost:3306/CHOCOLATE";
		String userName="root";
		String password="Aishusushma@57";

		String read="select *from CHOCOLATES where id=21";
		try {
			
		//Driver mysqlDriver=new Driver();	
		//DriverManager.registerDriver(mysqlDriver);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("connection is succeed "+url+" " +password);
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(read); //by deafault it will be pointed to col
		resultSet.next();
	     System.out.println("id"+":-"+resultSet.getInt(1));
	     System.out.println("name"+":-"+resultSet.getString(2));
		 System.out.println("since"+":-"+resultSet.getString(3));
		 System.out.println("location"+":-"+resultSet.getString(4));
		 System.out.println("contact"+":-"+resultSet.getInt(5));
		 System.out.println("review"+":-"+resultSet.getString(6));
		
		}
		catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
			
		}
		catch(Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			
		}
		
	}
		
	

	@Override
	public void readAll() {
		String url="jdbc:mysql://localhost:3306/CHOCOLATE";
		String userName="root";
		String password="Aishusushma@57";

		 String readAll="select*from CHOCOLATES";
		try {
			
		//Driver mysqlDriver=new Driver();	
		//DriverManager.registerDriver(mysqlDriver);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection =DriverManager.getConnection(url,userName,password);
		System.out.println("connection is succeed "+url+" " +password);
		Statement statement=connection.createStatement();

		ResultSet resultSet=statement.executeQuery(readAll); 
		//boolean isRowPresent=resultSet.next();
		//while(isRowPresent)
		while(resultSet.next()) {
		System.out.println("id"+":-"+resultSet.getInt(1));
		System.out.println("name"+":-"+resultSet.getString(2));
		System.out.println("since"+":-"+resultSet.getString(3));
		System.out.println("location"+":-"+resultSet.getString(4));
		System.out.println("contact"+":-"+resultSet.getInt(5));
		System.out.println("review"+":-"+resultSet.getString(6));
		
		}
		}
		catch(SQLException sqlException){
			System.out.println(sqlException.getMessage());
			
		}
		catch(Exception classNotFoundException) {
			System.out.println(classNotFoundException.getMessage());
			
		}
		
	}
		
	}

	

