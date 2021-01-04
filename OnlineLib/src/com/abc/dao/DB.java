package com.abc.dao;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load the driver");
	    FileInputStream fis=new FileInputStream("/Users/ShashankJha/Desktop/OnlineLibrary/OnlineLib/src/com/abc/utility/infoprop/ip.properties");
		Properties p=new Properties();
		p.load(fis);
     	//con=DriverManager.getConnection("jdbc:mysql:thin:@localhost:3306:E_Librarian","root","shinakshi01");
		con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("user"),p.getProperty("password"));
		System.out.println("Connection Establishment");
	}
      catch(Exception e)
     	{
		System.out.println(e);
	}
	return con;

}
}
