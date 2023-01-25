package com.java.logic;

import java.util.Scanner;

public class twoIntegers {
	public static void main (String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1st integer: ");
		int firstInteger= sc.nextInt();
		System.out.println("Input 2nd integer: ");
		int secondInteger= sc.nextInt();
		
		int sum = firstInteger+secondInteger;
		System.out.println("Sum of two integers: " +sum);
		int difference = firstInteger-secondInteger;
		System.out.println("Difference of two integers: "+difference);
		int product = firstInteger * secondInteger;
		System.out.println("Product of two integers: "+product);
		double reminder = firstInteger % secondInteger;
		System.out.println("Remainder of two numbers: "+reminder);
		float average = sum / 2;
		System.out.println("Average of two integers: "+average);
		
		System.out.println("Distance of two integers: ");
		if(firstInteger>secondInteger)
		{
		System.out.println("Max integer: "+firstInteger);
		System.out.println("Min integer: "+secondInteger);
		}
		else
		{
			System.out.println("Max integer: "+secondInteger);
			System.out.println("Min integer: "+firstInteger);
		}	
		sc.close();

	}
}
