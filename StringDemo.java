package com.Abhay.Practice;

import java.util.Scanner;

//STRING OPERATIONS
public class StringDemo {
	public static void main(String[] args){
		String s1,s2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 strings: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		
		int l1 = s1.length();			//Finding the length of the string
		int l2 = s2.length();
		
		String s3 = s1.concat(s2);		// Also can be done by s1 + s2
		
		s1 = s1.toUpperCase();
		
		System.out.println("Result of concatenation is: " + s3);
		
		System.out.println("String lenght of 1 is:" + l1);
		System.out.println("String lenght of 2 is:" + l2);
		
		System.out.println("First string in UpperCase: " + s1);
		
	}
}
