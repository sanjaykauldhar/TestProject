package com.java.logic;

import java.util.Scanner;

public class leapYear{

	public static void main(String [] args)
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any year to find out whether it is Leap Year or not");
		year = sc.nextInt();
		
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
		{
			System.out.println(year+" is a Leap Year");
		}
		else
		{
			System.out.println(year+" is not a Leap Year");	
		}
		sc.close();
	}
	
}
