package com.hcl.domino.assignment1;

import java.util.Arrays;



public class Program6 {

	



	//declaring the variables

		private int val;

		private char[] name=new char[50] ;	

		

		//default constructor

		Program6()

		{

			System.out.println("Default constructor");

		}

		

		//parameterized constructor 

		Program6(int val)

		{

			this.val=val;

			System.out.println("Overloaded constructor with integer value ");

		}

		

		//parameterized constructor

		Program6(char[] values)

		{

			name = new char[values.length]; 

	        for (int j = 0; j < name.length; j++) 

	        { 

	        	name[j] = values[j]; 

	        }

			System.out.println("Overloaded constructor with character value ");

		}

		

		//parameterized constructor

		Program6(int val, char[] values)

		{

			this.name=values;

			this.val=val;

			System.out.println("Overloaded constructor with integer,character values");	

		}

		

		public void show()

		{

			System.out.println("The integer value is: "+val+"\nThe character values are: "+Arrays.toString(name));

		}

		

		public static void main(String[] args) 

		{

			char C[]= {'a','b','c','d','e'};

			

			Program6 S=new Program6();

			

			Program6 S1=new Program6(10);

			S1.name=C;

			S1.show();

			

			//deep copying

			System.out.println("Deep copy");

			Program6 S2 =new Program6(C);

			S2.val=10;

			S2.show();

			C[0]='s';

			S2.show(); 

			

			//shallow copying

			System.out.println("Shallow copy");

			Program6 S3=new Program6(20,C);

			S3.show();

		}



	}