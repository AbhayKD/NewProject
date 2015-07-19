package com.Abhay.Practice;


import java.util.Scanner;

public class LUE{
	public static void main(String[] args){
		int i,j=0;
			int[] Number=new int[20];
			Scanner sc = new Scanner(System.in);
				for(i=0;i<=10;i++){
					++j;
					Number[i]= sc.nextInt();
					if(Number[i] == 42)
						break;
					else
						continue;
				}
		for(int a:Number)
		System.out.println(a);
	}
}

