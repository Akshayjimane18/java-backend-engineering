package coreJava.ExtendsThreadView;

public class ChildThread extends Thread {
	
	public ChildThread() {
		// TODO Auto-generated constructor stub
		/*thread creation*/
		super("Child 1");
		start();
	}
	public void run(){
		Thread t=currentThread();
		System.out.println("Child thread started");
		for(int i =5;i>=0;i--){
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(t.getName()+":"+i);
		}
		System.out.println("child thread exited");
	}
		
	}


