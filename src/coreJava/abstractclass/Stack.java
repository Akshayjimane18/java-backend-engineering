package coreJava.abstractclass;

public abstract class Stack {
	int top=-1;
	int st[]=new int[5];
	public abstract void push(int e);
	public abstract int pop();
	public void display(){
		if(top!=-1){
			for(int i=top;i>=0;i--){
				System.out.println(st[i]);
			}
			
		}
		else{
			System.out.println("stack empty");
		}
	}
	

}
