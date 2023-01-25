package com.java.logic;

import java.util.Scanner;

public class greatestNo {

	public static void main (String [] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int numberOne = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int numberTwo = sc.nextInt();
		System.out.println("Enter the Third Number: ");
		int numberThree = sc.nextInt();
		if (numberOne>numberTwo && numberOne>numberThree)
		{
			System.out.println(numberOne+" is the greatest no");	
		}
		if(numberTwo>numberOne && numberTwo>numberThree)
		{
			System.out.println(numberTwo+" is the greatest no");	
		}
		if(numberThree>numberOne && numberThree>numberTwo)
		{
			System.out.println(numberThree+" is the greatest no");	
		}		
		sc.close();
	}
}
