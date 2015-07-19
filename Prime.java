package com.Abhay.Practice;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args){
	PrimeNo a = new PrimeNo();
	a.Check(a.NoOfCases());
	}
}

class PrimeNo{
	int i,j;
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	Scanner sc2 = new Scanner(System.in);
	public void Check(int Cases){
		for(int i=1;i<=Cases;i++){
			System.out.println("Enter the first no.: ");
			int FirstNo = sc1.nextInt();
			System.out.println("Enter the second no.:  ");
			int SecondNo = sc2.nextInt();
			for(j=SecondNo;j>FirstNo;j--)
				for(int k=2;k<j;k++){
					if(j % (j - 1) != 0){
						System.out.println(j);
					}
			}
		}
	}
	
	public int NoOfCases(){
		System.out.println("Enter the no. of cases you want to perform: ");
		int Cases = sc.nextInt();
		return Cases;
	}
}