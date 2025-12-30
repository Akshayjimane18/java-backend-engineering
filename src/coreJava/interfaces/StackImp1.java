package coreJava.interfaces;

class StackImp1 implements Queue{
	int top=-1;
	int st[]=new int[size];
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
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	

}
