package coreJava.queuedemo;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pqv=new PriorityQueue<Integer>();
		pqv.add(2);
		pqv.add(5);
		pqv.add(2);
		
		System.out.println(pqv);
		pqv.remove();
		System.out.println(pqv);
		
		
		
		

	}

}
