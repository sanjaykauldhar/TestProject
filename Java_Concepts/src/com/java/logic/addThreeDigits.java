package com.java.logic;
import java.util.Scanner;
public class addThreeDigits
{
    public static void main (String [] args ){
        System.out.println("Enter an integer from 0 to 999 below and press enter to find sum: ");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();
        int firstDigit = enteredNumber / 100;
        int secondDigit = enteredNumber / 10 % 10;
        int thirdDigit = enteredNumber % 10;
        System.out.println("First Digit is: " + firstDigit);
        System.out.println("Second Digit is: "+ secondDigit);
        System.out.println("Third Digit is: " + thirdDigit);
        int sum = firstDigit + secondDigit + thirdDigit;
        System.out.println("The sum of digits is: " + sum);
        sc.close();
    }
    
        
}
