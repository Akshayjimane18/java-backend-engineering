package coreJava.UserdefinedExceptioin;

public class NegativeAnswerException extends Exception{
	String description;
	public NegativeAnswerException() {
		// TODO Auto-generated constructor stub
	}
	NegativeAnswerException(String description){
	this.description=description;
	}
	@Override
	public String toString() {
		return "NegativeAnswerException [description=" + description + "]";
	}
	

}
