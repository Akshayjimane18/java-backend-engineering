package coreJava.runnableinterface;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new ChildThread("c1");
		Runnable r1=new ChildThread("c2");
		
		Runnable r2=new ChildThread("c3");
		for(int i=5;i>=0;i--){
			try {
				
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("main"+i);
			System.out.println("main thread exited");
			
		}

	}

}
