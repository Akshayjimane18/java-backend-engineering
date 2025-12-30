package coreJava.abstractclass;

public class StackImp1 extends Stack {
	public void push(int e){
		if(top==4){
			System.out.println("stack overflow");
		}
		else{
			top++;
			st[top]=e;
			System.out.println("push"+st[top]);
			
		
		}
	
	}
	@Override
	public int pop() {
		// TODO Auto-generated method stub
		
		if(top==-1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else{
			int e=st[top];
			top--;
			return e;
	}

	}
}