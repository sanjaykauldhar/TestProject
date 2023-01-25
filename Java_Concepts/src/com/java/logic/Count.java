package com.java.logic;
public class Count {

  public static void main(String[] args) {

    int count = 0, num = 12345678;

    while (num != 0) {
      num /= 10;
      ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}