package com.hcl.domino.assignment1;


public class Access {

	private int p=111;
	protected int x=222;
	public int b=123;
	public int square(int b)
	{
		return b*b;
	}
	protected int square1(int x)
	{
		return x*x;
	}
	private int square2(int p)
	{
		return p*p;
	}

	public static void main(String[] args) {
		Access a= new Access();

		System.out.println(a.p+" "+a.square2(10));
	}

}


