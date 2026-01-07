package coreJava.multithreadingAndConcurrency.basicThreadPractice;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread started");
		ThreadDemo td=new ThreadDemo();
		td.setName("ct1");
		td.start();
		for(int j=5;j>=0;j--){
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main"+j);
			System.out.println("main thread exited");
			
		}
		
		
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
