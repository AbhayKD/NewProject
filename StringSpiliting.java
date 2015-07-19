package com.Abhay.Practice;

/**
 * Comma Separated Values (CSV): This can be used to split a string with the indicator character
 * So instead of printing the whole string at once we can print parts of the string...
 *
 */
public class StringSpiliting {
	public static void main(String[] args){
		String str = "Abhay, Akshay, Rahul, Alisha, Ratnesh";
		String names[] = str.split(",");		//Here we are splitting the string into a string array so we are assigning the values to
		for(String val : names)
		System.out.println(val);			//an array of string.
	}
	
}
