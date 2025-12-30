package coreJava.march_22;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note,amount=0,rem;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		sc.nextInt();
		if(amount % 100 != 0)
		{
			System.out.println("you cannot proceed");
			
	
		if(amount>1000)
		{
			note= 5310/1000;
			rem=5310%1000;
			amount=rem;
			
		}
		if(amount>100)
		{
			note=5310/100;
			rem=5310%100;
			amount=rem;
			
		}
		if(amount>10)
		{
			note=5310/10;
			rem=5310%10;
			amount=rem;
		}
		

}
		
		sc.close();
}
}
