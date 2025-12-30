package coreJava.InterThreadcommunication;

public class PCoperations {
	 int n;
	 volatile boolean flag=false;
	synchronized void produce(int n){
		if(flag==true)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.n=n;
		System.out.println("produce"+n);
		flag=true;
		notify();
		
	}
	synchronized void consumed(){
		if(flag==false)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("consumed"+n);
		flag=false;
		notify();
		
	}

}
