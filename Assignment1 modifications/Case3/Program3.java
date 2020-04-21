package com.hcl.domino.assignment1;

public class Program3 {

		static int width=5;// Class level scope

		public static void main(String[] args) {

			int length=10;// Method level scope

			//System.out.print(width+" "); No Error because variable is accessible throughout the class
			//System.out.print(length+" "); No Error because variable is accessible declared method
			//System.out.print(breadth+" "); Error because accessible only in declared loop

			for(int breadth=1;breadth<=10;breadth++)//Loop level scope
			{
				print();
				//System.out.print(width+" "); No Error because variable is accessible throughout the class
				//System.out.print(length+" "); No Error because variable is accessible declared method
				//System.out.print(breadth+" "); No Error because variable accessible in declared loop

				System.out.println(length*breadth*width);			
			}	

		}

		static void print()
		{
			System.out.print(width+" ");
			//System.out.print(length+" "); Error because accessible only up to method
			//System.out.print(breadth+" "); Error because accessible only up to Class

		}

	}



