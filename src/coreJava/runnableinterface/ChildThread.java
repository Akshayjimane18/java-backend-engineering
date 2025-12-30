package coreJava.runnableinterface;

public class ChildThread implements Runnable{
	Thread t;
	ChildThread(String name){
		t=new Thread(this,name);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Child thread started");
		for(int i =5;i>=0;i--){
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.getName()+":"+i);
		}
		System.out.println("child thread exited");
		
		
	}

	private Thread ChildThread() {
		// TODO Auto-generated method stub
		return null;
	}

}
