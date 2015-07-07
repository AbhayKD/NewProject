package com.Abhay.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerUser {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		String q= s.nextLine();
		System.out.println(q);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
	
	}

}
