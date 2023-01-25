package com.java.logic;
import java.util.Scanner;
public class sumAverage
{
    public static void main (String [] args ){
        System.out.println("Input the 5 numbers: ");
        Scanner sc = new Scanner(System.in);
        int enteredNumber = sc.nextInt();
        int firstNo = enteredNumber / 10000;
        int secondNo = enteredNumber / 1000 % 10;
        int thirdNo = enteredNumber / 100 % 10;
        int fourthNo = enteredNumber / 10 % 10;
        int fifthNo = enteredNumber % 10;
        System.out.println(firstNo);
        System.out.println(secondNo);
        System.out.println(thirdNo);
        System.out.println(fourthNo);
        System.out.println(fifthNo);
        
        int sum = firstNo + secondNo + thirdNo + fourthNo + fifthNo ;
        System.out.println("The sum of 5 No is: " + sum);
        double avg = (double) sum / 5;
        System.out.println("The average is: " + avg);        
        sc.close();
    }
        
}
