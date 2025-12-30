package coreJava.ExtendsThreadView;

public class ExtendThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("main thread started");
		ChildThread ct=new ChildThread();
		for(int j=5;j>=0;j--){
			System.out.println("main"+j);
			Thread.sleep(3000);
			System.out.println("main thread exited");
		}
		

	}

}
