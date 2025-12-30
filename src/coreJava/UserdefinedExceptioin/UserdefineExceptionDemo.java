package coreJava.UserdefinedExceptioin;

import java.util.Scanner;

public class UserdefineExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		
		try{
			sc=new Scanner(System.in);
			VoterApplication va=new VoterApplication();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			va.checkAge(age);
			
		}
		catch(AgeInvalidException ae){
			System.out.println("Age is invalid");
			ae.printStackTrace();
			
		}
		finally{
			sc.close();
		}

	}

}
