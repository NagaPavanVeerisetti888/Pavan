package com.friendsBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void updateDetails(String x,String s1,String s2) throws SQLException
	{
		Connection con=ConnectionJDBC.connection();
		PreparedStatement ps=con.prepareStatement(x);
		ps.setString(1, s2);
		ps.setString(2, s1);
		int rs=ps.executeUpdate();
		if(rs==1)
			System.out.println("Updated Successfully...");	
		else
			System.out.println("Following credentials are already in use Please check them...");	
	}
}

class Delete{
	public static void deleteDetails(String x,String s1,String s2) throws SQLException
	{
		Connection con=ConnectionJDBC.connection();
		PreparedStatement ps=con.prepareStatement(x);
		ps.setString(1, s1);
		int rs=ps.executeUpdate();
		if(rs==1)
			System.out.println("Deleted Successfully...");	
		else
			System.out.println("Following credentials are already in use Please check them...");	
	}
}