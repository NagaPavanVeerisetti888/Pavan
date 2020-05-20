package com.friendsBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SignUp {

	public static String signup(String fname,String lname,String email,String uname,String pswd) throws SQLException
	{
		Connection con=ConnectionJDBC.connection();
		PreparedStatement ps=con.prepareStatement("INSERT INTO FriendsBookEntry VALUES(?,?,?,?,?)");
		ps.setString(1, fname);
		ps.setString(2, lname);
		ps.setString(3, email);
		ps.setString(4, uname);
		ps.setString(5, pswd);
		int rs=ps.executeUpdate();
		if(rs==1)
			System.out.println(fname+" Registered Successfully...");	
		else
			System.out.println("Following credentials are already in use Please check them...");
		return uname;
	}
}

class SignIn
{
	public static String signin(String email,String pswd) throws SQLException
	{
		Connection con=ConnectionJDBC.connection();
		PreparedStatement ps=con.prepareStatement("SELECT userName FROM FriendsBookEntry WHERE emailID=? AND password=?");//WHERE emailID=? AND password=?");
		ps.setString(1, email);
		ps.setString(2, pswd);
		ResultSet res=ps.executeQuery();
		if(res.next())
			System.out.println("Welcome "+res.getString(1));
		else
			System.out.println("Please check and Enter correct credentials...");
		return res.getString(1);
	}
	
}
