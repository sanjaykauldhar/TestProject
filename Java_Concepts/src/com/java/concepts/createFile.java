package com.java.concepts;

import java.io.File;
import java.io.IOException;
  
public class createFile {
    public static void main(String[] args)
    {
  
        try {
            File Obj = new File("C:\\Sanjay\\Selenium\\test.txt");
            if (Obj.createNewFile()) {
                System.out.println("File created: "
                                   + Obj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}