package com.Abhay.Practice;

import java.util.Scanner;

public class Bytelandian {
	public static void main(String[] args){
		Conversion c = new Conversion();
		c.test();
	}
	
}

class Conversion{
	double GoldCoinVal;
	double DollarVal;
	public void test(){
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Bytelandian Gold Coin you have: ");
		GoldCoinVal = sc.nextDouble();
		DollarVal = (GoldCoinVal/2) + (GoldCoinVal/3) + (GoldCoinVal/4);
		int DollarNewVal = (int)DollarVal;
		System.out.println("Dollar conversion amount is :" + DollarNewVal +"$");
		}
	}
		
}