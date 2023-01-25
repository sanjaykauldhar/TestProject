package com.java.concepts;

// Import the File class
import java.io.File;

public class deleteFile {
	public static void main(String[] args)
	{
		File Obj = new File("C:\\Sanjay\\Selenium\\test.txt");
		if (Obj.delete()) {
			System.out.println("The deleted file is : "
							+ Obj.getName());
		}
		else {
			System.out.println(
				"Failed in deleting the file.");
		}
	}
}
