package com.hcl.domino.assignment1;

public class Program1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ingeneral as Java has fixed datatypes, sizeof command is not worked in Java
		for(int i=0;i<args.length;i++)
		{
			try
			{
				int a=Integer.parseInt(args[i]);
				System.out.println(a+" integer "+Integer.SIZE/8);
			}
			catch(Exception e1)
			{
				try
				{
					System.out.println(Float.parseFloat(args[i])+" float/double "+Float.SIZE/8);
				}
				catch(Exception e2)
				{
					if(args[i].length()==1)
					{
						System.out.println(args[i]+" char "+Character.SIZE/8);
					}
					else
					{
						System.out.println(args[i]+" string "+args[i].length());
						//String is non primitive datatype so no default size is not specified.
					}
				}
			}
		}

	}

}


