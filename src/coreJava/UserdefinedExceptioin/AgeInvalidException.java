package coreJava.UserdefinedExceptioin;

public class AgeInvalidException extends Exception{
	String description;
	public AgeInvalidException() {
		// TODO Auto-generated constructor stub
		
	}
	AgeInvalidException(String description ){
		this.description=description;
		
	}
	@Override
	public String toString() {
		return "AgeInvalidException [description=" + description + "]";
	}
	

}
