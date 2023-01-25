package com.java.logic;

import java.util.Scanner;

public class weekday{
	public static void main (String [] args)
	{
	System.out.println("Enter a number between 1 to 7 below: ");		
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	String day="";
	
	switch (i)
	{
	case 1: day="Monday";
	break;
	case 2: day="Tuesday";
	break;
	case 3: day="Wednesday";
	break;
	case 4: day="Thursday";
	break;
	case 5: day="Friday";
	break;
	case 6: day="Saturday";
	break;
	case 7: day="Sunday";
	break;
	default: System.out.println("Enter no between 1-7");
	}
	System.out.println(day);
	sc.close();
	}
	

}
