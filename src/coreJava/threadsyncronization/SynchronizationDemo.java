package coreJava.threadsyncronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		HusbandThread ht=new HusbandThread(b);
		WifeThread wt=new WifeThread(b);
	}

}
