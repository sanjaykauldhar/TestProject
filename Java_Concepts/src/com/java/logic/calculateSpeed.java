package com.java.logic;

import java.util.Scanner;

public class calculateSpeed {

			
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input distance in meters:");
		double distance = sc.nextDouble();
		double distanceinkm = distance / 1000;
		double distanceinmiles= distance / 1609;
		
		System.out.println("Input hours:");
		double hours = sc.nextDouble();
		double hourinsecond = hours * 3600; 
		System.out.println("Input minutes:");
		double minutes = sc.nextDouble();
		double minutesinsecond = minutes * 60;
		double minutesinhours = minutes / 60;
		
		System.out.println("Input seconds:");
		double seconds = sc.nextDouble();
		double secondsinhour = seconds / 3600;
		
		double timeinseconds = hourinsecond + minutesinsecond + seconds;
		double timeinhours = hours + minutesinhours + secondsinhour;
		
		double speed = distance / timeinseconds;
		double speed1 = distanceinkm / timeinhours;
		double speed2 = distanceinmiles / timeinhours;
		
		
		System.out.println("Your speed in meters/second is "+speed);
		System.out.println("Your speed in km/h is "+speed1);
		System.out.println("Your speed in miles/h is "+speed2);

		sc.close();
	}
	

}
