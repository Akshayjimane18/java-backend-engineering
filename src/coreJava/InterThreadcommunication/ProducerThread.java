package coreJava.InterThreadcommunication;

public class ProducerThread implements Runnable
{
	PCoperations pc;
	Thread t;
	int i=1;
	
	public ProducerThread(PCoperations pc) {
		this.pc=pc;
		t=new Thread(this,"Producer");
		t.start();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(i<=10){
		pc.produce(i);
		i++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}
	
	

}
