package coreJava.threadsyncronization;

public class WifeThread implements Runnable{
	Thread t;
	Bank b;

	public WifeThread(Bank b) {
		this.b=b;
		t=new Thread(this,"wife");
		t.start();
	}
	@Override
	public void run() {
		b.Withdraw();
		
	}

}
