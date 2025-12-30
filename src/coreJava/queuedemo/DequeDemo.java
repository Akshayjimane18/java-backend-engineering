package coreJava.queuedemo;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> dd=new LinkedList<Integer>();
		dd.add(3);
		dd.add(3);
		dd.add(2);
		dd.add(4);
		dd.add(5);
		dd.add(null);
		dd.add(null);
		System.out.println(dd);
		dd.removeFirst();
		System.out.println(dd);
		dd.removeLast();
		System.out.println(dd);
		

	}

}
