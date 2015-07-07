package com.Abhay.Practice;

import java.io.IOException;

/*USER INPUT
 *We can use Scanner, BufferedReader */

public class UserInput {
	public static void main(String[] args) throws IOException{
	
		/*int i =  System.in.read();	//It takes input as a int which is the corresponding ascii value to it and prints it so it must be converted to char to get the same output
		System.out.println((char)i);*/
		
		String str = "";
		int j = 0;
		while(j!=15){
			j++;
			int i = System.in.read();
			str = str + (char)i;
		}
		System.out.println(str);
	}
}
