package coreJava.InterThreadcommunication;

public class ConsumerThread implements Runnable {
	PCoperations pc;
	Thread t;
	
	public ConsumerThread(PCoperations pc){
		
		
			
		
		this.pc=pc;
		t=new Thread(this,"Consumer");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		pc.consumed();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	

}
