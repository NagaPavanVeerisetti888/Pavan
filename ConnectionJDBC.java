package com.friendsBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
	static Connection con;
	public static Connection connection()
	{
		//Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Class Loaded..");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			//System.out.println("Connection established..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void close() throws SQLException
	{
		con.close();
	}
	
}