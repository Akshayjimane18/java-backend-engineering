package coreJava.interfaces;

 public interface Stack {
	 void push(int e);
	 void display();
	 
 }
	 
	  interface Queue extends Stack{
		 abstract int pop();
		 
		 int size=5;
	 }
	 

	  
 
