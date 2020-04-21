package com.hcl.domino.assignment1;

import java.util.Scanner;


public class Program2 {


	public static void main(String[] args) {
		int number,temp = 0;
		// TODO Auto-generated method stub
		System.out.println("Please enter the itteration number ");
		Scanner sc =new Scanner(System.in);
		number = sc.nextInt();
		for(int itteration=1;itteration<=number;itteration++) {
			temp += (itteration*itteration);

		}
		System.out.println(temp);

	}

}

