package com.friendsBook;

import java.sql.SQLException;
import java.util.Scanner;

public class User {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String user="";
		String s1="",s2="",x="";
		int desc;
		do
		{
		System.out.println("Welcome to FriendsBook");
		System.out.println("1. Sign Up \t 2.Sign In");
		System.out.println("Select a Number to continue...");
		int log=sc.nextInt();
		if(log==1)
		{
			System.out.println("Create an account...");
			System.out.println("Enter First Name: ");
			String fname=sc.next();
			System.out.println("Enter Last Name: ");
			String lname=sc.next();
			System.out.println("Enter Email ID: ");
			String email=sc.next();
			System.out.println("Enter User Name: ");
			String uname=sc.next();
			System.out.println("Enter Password: ");
			String pswd=sc.next();
           
			user=SignUp.signup(fname, lname, email, uname, pswd);
			break;
			
		}
		else if(log==2)
		{
			System.out.println("Enter Email ID: ");
			String email=sc.next();
			System.out.println("Enter Password: ");
			String pswd=sc.next();
			
			user=SignIn.signin(email, pswd);
			break;	
		}
		else
			System.out.println("Select Correct Number");
		}
		while(true);
		do
		{
			System.out.println("Welcome..."+user);
			System.out.println("1. Update Your Details \n 2.Delete your friend \n 3. Search for your friend \n 4.Exit");
			int des=sc.nextInt();
			
			if(des==1)
			{
				System.out.println("Select to Update\n1. First name\n2.Last Name\n3.Email ID\n4.User Name\n5.Password");
				desc=sc.nextInt();
				switch(desc)
				{
				case 1: x="UPDATE FriendsBookEntry SET firstName=? WHERE emailID=?";
				System.out.println("Enter EmailID: ");
				s1=sc.next();
				System.out.println("Enter First Name to be Updated: ");
				s2=sc.nextLine();
			    break;
				case 2: x="UPDATE FriendsBookEntry SET lastName=? WHERE emailID=?";
				System.out.println("Enter EmailID: ");
				s1=sc.next();
				System.out.println("Enter Last Name to be Updated:: ");
				s2=sc.nextLine();
			    break;
				case 3: x="UPDATE FriendsBookEntry SET emailID=? WHERE userName=?";
				System.out.println("Enter User Name : ");
				s1=sc.nextLine();
				System.out.println("Enter EmailID to be Updated: ");
				s2=sc.next();
			    break;
				case 4: x="UPDATE FriendsBookEntry SET userName=? WHERE emailID=?";
				System.out.println("Enter EmailID: ");
				s1=sc.next();
				System.out.println("Enter User Name to be Updated:: ");
				s2=sc.nextLine();
			    break;
				case 5: x="UPDATE FriendsBookEntry password=? WHERE emailID=?";
				System.out.println("Enter EmailID: ");
				s1=sc.next();
				System.out.println("Enter User Name: ");
				s2=sc.nextLine();
			    break;
				default:System.out.println("Enter correct details");
		        break;
				}
				if(desc==1||desc==2||desc==3||desc==4||desc==5)
				{
					Update.updateDetails(x, s1, s2);
				}
			}
			else if(des==2)
			{
				System.out.println("Select to Delete based on\n1. Username \n2.Email ID");
				desc=sc.nextInt();
				switch(desc)
				{
				case 1: x="DELETE FROM FriendsBookEntry WHERE emailID=?";
				System.out.println("Enter EmailID: ");
				s1=sc.next();
				break;
				case 2:x="DELETE FROM FriendsBookEntry WHERE userName=?";
				System.out.println("Enter username: ");
				s1=sc.next();
				break;
				default:System.out.println("Enter correct details");
				        break;
				}
				if(desc==1||desc==2)
				{
					Delete.deleteDetails(x, s1, s2);
				}	
			}
			else if(des==3)
			{
				System.out.println("Select to Search based on \n1.First name\n2.Email ID\n3.User Name\n");
				desc=sc.nextInt();
				switch(desc)
				{
				case 1: x="SELECT * FROM FriendsBookEntry WHERE firstName=?";
				System.out.println("Enter FirstName: ");
				s1=sc.next();
			    break;
				case 2: x="SELECT * FROM FriendsBookEntry WHERE emailID=?";
				System.out.println("Enter EmailID: ");
				s1=sc.next();
			    break;
				case 3: x="SELECT * FROM FriendsBookEntry WHERE userName=?";
				System.out.println("Enter User Name : ");
				s1=sc.nextLine();
			    break;
				default:System.out.println("Enter correct details");
		        break;
				}
				if(desc==1||desc==2||desc==3)
				{
					Search.search(x, s1);
				}	
			}
			else if(des==4)
			{
				ConnectionJDBC.close();
			    break;
			}
			else
			{
				System.out.println("Enter correct details");	
			}
			System.out.println();
			System.out.println();
		}while(true);
	}
}
