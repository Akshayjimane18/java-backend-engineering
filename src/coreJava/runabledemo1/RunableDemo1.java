package coreJava.runabledemo1;

public class RunableDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main execution started");
		try
		{
		Execution e=new Execution();
	
		Thread mt=Thread.currentThread();
		mt.setPriority(1);
		
		System.out.println(mt);
		Thread t=new Thread(e,"c1");
		Thread t1=new Thread(e,"c2");
		Thread t2=new Thread(e,"c3");
		t.setPriority(Thread.NORM_PRIORITY-1);
		System.out.println(t);
		
		mt.setPriority(Thread.MIN_PRIORITY);
		t.start();
		t1.start();
		t2.start();
		System.out.println(t.getName()+" "+t.isAlive());
		System.out.println(t1.getName()+""+t1.isAlive());
		for(int i=5;i>=0;i--){
			
				
				Thread.sleep(2000);
			
			System.out.println("main"+i);
		}
			System.out.println("main is waiting");
			t.join();
			System.out.println(t.getName()+" "+t.isAlive());
			t1.join();
			t2.join();
			System.out.println("main is out of wait");
			System.out.println("main thread exited");
			
		
	}
	
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
