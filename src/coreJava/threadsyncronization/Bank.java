package coreJava.threadsyncronization;

import java.util.Scanner;

public class Bank {
	private double bal=50000;
	
	
	 public void deposite(){
		try{
			synchronized(this){
			Scanner sc=new Scanner(System.in);
		System.out.println(Thread.currentThread().getName()+""+bal);
		System.out.println("Balance before deposite"+bal);
		Thread.sleep(3000);
		System.out.println("Enter the amount to deposite");
		double amount=sc.nextDouble();
		Thread.sleep(3000);
		bal=amount+bal;
		System.out.println("Balance after deposite"+bal);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	synchronized public void Withdraw(){
		try{
			Scanner sc=new Scanner(System.in);
		System.out.println("Balance before withdraw"+bal);
		Thread.sleep(3000);
		System.out.println("Enter the amount to withdraw");
		double amount=sc.nextDouble();
		Thread.sleep(3000);
		bal=bal-amount;
		System.out.println("Balance after withdraw"+bal);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
}
