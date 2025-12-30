package coreJava.UserdefinedExceptioin;

public class VoterApplication {
	void checkAge(int age)throws AgeInvalidException{
		if(age<18){
			throw new AgeInvalidException("age is less than 18 which is ="+age);
		}
		else{
			System.out.println("Welcome to Voting");
			
		}
	}

}
