package com.hcl.domino.assignment1;

public class Program5

{

	//creating the two objects

	 static Program5 S1, S2 ;	

	

	public void display( )   

	{  

		 System.out.println("Good Morning Vijayawada");  

	}

	protected void finalize( ) throws Throwable   

	{

		//checking for reference

		 if(S1  !=  null) 

		 	{

		      System.out.println("S1 object is not eligible for garbage collection and  still active");

		      

		      //making the reference to null

		      S1 = null;

		      

		      //check for null reference 

		      if (S1 == null) 

			System.out.println("S1 is not referenced and getting removed from memory");

		   }

		 

		//check for reference

		   if(S2  !=  null) 

		   {

		     System.out.println("S2 object is not eligible for garbage collection and is still active");

		     

		   //making the reference to null

		     S2 = null;

		     

		     

		   //check for null reference  

		     if(S2 == null) 

		    	 

			System.out.println("S2 is not referenced and getting removed from memory");

		   }

		   super.finalize( );  

		 }

		 public static void main( String args[])    

		 {

			 //creating a new anonymous object for class and assigning

		   S1 = new Program5(); 

   

		 //creating a new anonymous object for class and assigning

		   S2 = new Program5();

		   

		   //calling the show method with object reference S1

		   S1.display();  

		   

		   //calling the show method with object reference S1

		   S2.display( );

		   

		   System.runFinalizersOnExit(true);

		 }

		}      	