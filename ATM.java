package com.Abhay.Practice;

import java.util.Scanner;

public class ATM {
	
	public static void main(String [] args){
		Test ac = new Test();
		ac.Withdraw();
		}
	
}

class Test{
	double MainBalance=2000;
	Scanner sc = new Scanner(System.in);
	public void Withdraw(){
		System.out.println("Please enter the amount you wanna withdraw: ");
		double WithdrawAmt=sc.nextDouble();
		if(WithdrawAmt <
				MainBalance){
			if((WithdrawAmt) % 5 == 0){
				MainBalance = MainBalance - (WithdrawAmt + 0.5);
				System.out.println("Available Balance is :" + MainBalance);
			}
			else{
				System.out.println("Main Balance is :" + MainBalance);
			}
		}
		else{
			System.out.println(MainBalance);
		}
	}
}
