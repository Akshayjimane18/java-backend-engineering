package coreJava.methodOverriding;

public class Child1 extends father{
	void dream(){
		System.out.println("The son want to become a engineer");
	}
	public static void main(String[]args)
	{
		Child1 c=new Child1();
		c.dream();
	}
	

}
