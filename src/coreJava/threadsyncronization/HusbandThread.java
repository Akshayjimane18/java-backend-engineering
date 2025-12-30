package coreJava.threadsyncronization;

public class HusbandThread implements Runnable{
	Bank b;
	Thread t;
	HusbandThread(Bank b){
		this.b=b;
		t=new Thread(this,"Husband");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			b.deposite();
		
		
		
		
	}
	

}
