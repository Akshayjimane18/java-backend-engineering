package coreJava.interfaces;


import java.util.Scanner;



public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StackImp1 s=new StackImp1();
		int ch=0;
		
		
		
			
		
		System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
		do{
			System.out.println("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				System.out.println("Enter the number");
				int e=sc.nextInt();
				s.push(e);
				
				break;
				
			case 2:
				e=s.pop();
				if(e!=-1)
				{
					System.out.println("popped"+e);
				}
				
				 
			
				break;
			case 3:
				s.display();
			  
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
				break;
				
			default:
				System.out.println("u have entered the wrong choice");
				
		}
		}while(ch!=4);
		
		

	}

	}


