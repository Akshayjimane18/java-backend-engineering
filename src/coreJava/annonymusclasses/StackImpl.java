package coreJava.annonymusclasses;

public class StackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack()
		
		{
			int pop()
			{
				System.out.println("In pop method ");
				return 0;
			}
		};
		s.pop();

	}

}
