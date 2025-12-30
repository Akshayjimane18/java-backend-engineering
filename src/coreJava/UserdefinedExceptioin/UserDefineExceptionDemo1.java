package coreJava.UserdefinedExceptioin;

import java.util.Scanner;

public class UserDefineExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c,choice=0 ;
		Scanner sc=null;
		try{
			
		SmallCalculater s=new SmallCalculater();
			
		do{
			sc=new Scanner(System.in);
			System.out.println("1.Addition\n2.Subtraction\n3.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
		
			System.out.println("Enter the value of a");
			a=sc.nextInt();
			System.out.println("Enter the value of b");
			b=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			try{
				
				s.checkAddition(a, b);
				
			}
			catch(ValueBeyondLimitException ve){
				ve.printStackTrace();
				
			}
			break;
		case 2:
			try{
				
				s.checkSubraction(a, b);
				
			}
			catch(NegativeAnswerException ne){
				ne.printStackTrace();
				
			}
			break;
		case 3:
			System.out.println("thank you");
			System.exit(0);
			break;
			default:
				System.out.println("you have entered the wrong choice");
				break;
		
		}//end swithc
		}//end do
		while(choice!=3);
		
		
		}//try close		
		catch(Exception e){
			
		System.out.println("Exception caught");
			e.printStackTrace();
		}
		finally 
		{
			sc.close();
		}
	}
}
	

