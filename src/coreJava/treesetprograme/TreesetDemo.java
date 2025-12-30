package coreJava.treesetprograme;

import coreJava.accountlist.Account;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;




public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Account> alist=new TreeSet<Account>();
		Account a=new Account();
		Scanner sc=null;
		boolean flag=false;
		int choice = 0;
		a.setAcNo(107);
		a.setBalance(1000);
		a.setAcType("Saving");
		
		alist.add(a);
		Account a1=new Account();
		a1.setAcNo(102);
		a1.setBalance(2700);
		a1.setAcType("Current");
		
		alist.add(a1);
		Account a2=new Account();
		a2.setAcNo(103);
		a2.setBalance(5660);
		a2.setAcType("Saving");
		
		alist.add(a2);
		
		Account a3=new Account();
		a3.setAcNo(104);
		a3.setBalance(7000);
		a3.setAcType("Current");
		
		alist.add(a3);
		
		Iterator lit=alist.iterator();
		
		while(lit.hasNext()){
			System.out.println(lit.next());
		}
		
		do{
			System.out.println("1:Add Account");
			System.out.println("2:update Account  ");
			System.out.println("3:Delete Account");
			System.out.println("4:Search Account by id ");
			System.out.println("5:Display all account ");
			
			System.out.println("6:Account");
			System.out.println("Enter the choice=");
			sc=new Scanner(System.in);
			choice=sc.nextInt();
			
		
		switch(choice)	
		{
		case 1:
			
			System.out.println("Enter the account number");
			int acNo=sc.nextInt();
			System.out.println("Enter the account balance");
			double acBalance=sc.nextInt();
			System.out.println("Enter the account Type");
			String acType=sc.next();
			Account a4=new Account();
			a4.setAcNo(acNo);
			a4.setBalance(acBalance);
			a4.setAcType(acType);
			alist.add(a4);
			break;
		case 2:
			flag=false;
			System.out.println("Enter the account number");
			acNo=sc.nextInt();
			lit=alist.iterator();
			while(lit.hasNext())
			{
				a=(Account) lit.next();
				if(acNo==a.getAcNo())
				{
					flag=true;
					System.out.println("Enter the account balance");
					acBalance=sc.nextDouble();
					System.out.println("Enter the account type");
					acType=sc.next();
					a.setBalance(acBalance);
					a.setAcType(acType);
					System.out.println("Account updated successfully");
					break;
				}
				
			}
			if(flag==false){
				System.out.println("account not found");
			}
			break;
		case 3:
			flag=false;
			System.out.println("Enter the account number ");
			acNo=sc.nextInt();
			lit=alist.iterator();
			while(lit.hasNext()){
				
				a=(Account) lit.next();
				if(acNo==a.getAcNo())
				{
					flag=true;
					lit.remove();
					System.out.println("Account deleted successfullly");
					break;
				}
				
			}
			if(flag==false){
				System.out.println("account not found");
			}
			break;
		case 4:
			flag=false;
			System.out.println("Enter the account number ");
			acNo=sc.nextInt();
			lit=alist.iterator();
			while(lit.hasNext()){
				a=(Account) lit.next();
				if(acNo==a.getAcNo())
				{
					flag=true;
					System.out.println(a);
					break;
				}
				
				}
			if(flag==false){
				System.out.println("account not found");
			}
			
			break;
		case 5:
			lit=alist.iterator(); 
			while(lit.hasNext()){
				System.out.println(lit.next());
			
			}
			break;
		
		case 6:
			System.out.println("Thank you");
			System.exit(0);
			
			break;
			default:
				System.out.println("invalid choce");	
			
			
			
			
			
		}
		
		}while(choice!=6);
	}

}
