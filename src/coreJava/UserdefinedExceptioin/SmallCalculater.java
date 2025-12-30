package coreJava.UserdefinedExceptioin;

public class SmallCalculater {
	void checkAddition(int a, int b)throws ValueBeyondLimitException{
		int c=a+b;
		if(c>99999)
		{
			throw new ValueBeyondLimitException("The result "+c+"is beyond the limit which is 99999");
		}
		else{
			System.out.println("Addition of "+a+""+b+"is"+c);
		}
		
	}

	void checkSubraction(int a, int b)throws NegativeAnswerException{
		int c=a-b;
		if(c<0){
			throw new NegativeAnswerException("The result"+c+" is negative");
		}
		else{
			System.out.println("Subtraction of "+a+""+b+"is"+c);
		}
	
	
		
	}
}
