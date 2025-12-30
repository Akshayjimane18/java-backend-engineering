package coreJava.runabledemo1;

public class Execution implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Child thread started");
		for(int i =5;i>=0;i--){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println("child thread exited");
		
	}
	

}
