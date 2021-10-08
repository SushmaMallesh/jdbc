package com.chocolate;

import java.sql.*;

public class TestMain {
public static void main(String args[]) {
	String url="jdbc:mysql://localhost:3306/CHOCOLATE";
	String userName="root";
	String password="Aishusushma@57";
	String insert="insert into  CHOCOLATE.CHOCOLATES VALUES(12 ,'KITKAT1','1992','USA','888888','GUD')";
	String update="update CHOCOLATE.CHOCOLATES SET REVIEW='BAD' WHERE ID=2";
	String delete="delete from CHOCOLATE.CHOCOLATES where CHOCHOLATE_ID=14";
	
	
	
    String insert1="insert into CHOCOLATE.CHOCOLATES VALUES(17,'MILKY11','1998','INDIA','66676','EXCELLENT')";
    String insert2="insert into CHOCOLATE.CHOCOLATES VALUES(18,'MILKY22','1999','USA','666668','BAD')";
    String insert3="insert into CHOCOLATE.CHOCOLATES VALUES(19,'MILKY33','1999','USA','666669','GUD')";
    String insert4="insert into CHOCOLATE.CHOCOLATES VALUES(20,'MILKY44','1998','INDIA','666688','VERY GUD')";
    
    
    String read="select *from CHOCOLATES where id=11";
    String readAll="select*from CHOCOLATES";
    
    Connection connection=null;
    try {
		
	//Driver mysqlDriver=new Driver();	
	//DriverManager.registerDriver(mysqlDriver);
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	connection =DriverManager.getConnection(url,userName,password);
	System.out.println("connection is succeed "+url+" " +password);
	Statement statement=connection.createStatement();
	//statement.executeUpdate(insert4);
	//System.out.println("inserted");
	
	//statement.executeUpdate(update);
	//System.out.println("updated");
	//statement.executeUpdate(delete);
    //System.out.println("deleted");
	//statement.executeUpdate(insert1);
    //System.out.println("inserted insert1");
	//statement.executeUpdate(insert2);
	//System.out.println("inserted insert2");
	//statement.executeUpdate(insert3);
	//System.out.println("inserted insert3");
	//statement.executeUpdate(insert4);
	//System.out.println("inserted insert4");
	
	//ResultSet resultSet=statement.executeQuery(read); //by deafault it will be pointed to col
	//resultSet.next();
	//System.out.println("id"+":-"+resultSet.getInt(1));
	//System.out.println("name"+":-"+resultSet.getString(2));
	//System.out.println("since"+":-"+resultSet.getString(3));
	//System.out.println("location"+":-"+resultSet.getString(4));
	//System.out.println("contact"+":-"+resultSet.getInt(5));
	//System.out.println("review"+":-"+resultSet.getString(6));
	
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
    finally {
    	if(connection !=null)
    	{
    		System.out.println("connection closed");
    	}
    	else {
    		System.out.println("connection is not closed");
    	}
    }
	
}
}