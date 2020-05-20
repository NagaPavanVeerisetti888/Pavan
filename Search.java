package com.friendsBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {
	
	public static void search(String x,String s1) throws SQLException
	{
		Connection con=ConnectionJDBC.connection();
		PreparedStatement ps=con.prepareStatement(x);
		ps.setString(1, s1);
		ResultSet rs=ps.executeQuery();
		System.out.println("First Name"+"\tLast Name"+"\tEmailID"+"                \tUsername");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t            "+rs.getString(3)+"\t"+rs.getString(4));		
		}
	}

}