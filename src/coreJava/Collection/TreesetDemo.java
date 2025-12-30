package coreJava.Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>alist=new TreeSet<Integer>();
		alist.add(2);
		alist.add(4);
		
		
		
		alist.add(0);
		alist.add(1);
		alist.add(2);
		alist.remove(0);
		System.out.println(alist);

	}

}
