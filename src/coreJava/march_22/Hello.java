package coreJava.march_22;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		
		int a;
		int b;
		int sum,subtraction,devide,mul;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		sum=a+b;
		subtraction=a-b;
		devide=a/b;
		mul=a*b;
		
		
		System.out.println("Addition is = " +sum);
		System.out.println("subtraction is = "+subtraction);
		System.out.println("devidation is = "+devide);
		System.out.println("multiplication is = "+mul);
		
		
		
		
		sc.close();

	}
	
	

}
