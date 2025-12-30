package coreJava.UserdefinedExceptioin;

public class ValueBeyondLimitException extends Exception {

	String description;
	public ValueBeyondLimitException() {
		// TODO Auto-generated constructor stub
	}
	ValueBeyondLimitException(String description){
	this.description=description;
	}
	@Override
	public String toString() {
		return "ValueBeyondLimitException [description=" + description + "]";
	}
}
