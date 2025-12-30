package coreJava.InterThreadcommunication;

public class Threadcommunicationdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PCoperations pc=new PCoperations();
		ProducerThread pt=new ProducerThread(pc);
		ConsumerThread ct=new ConsumerThread(pc);
		
		
		
		

	}

}
