package coreJava.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>alist=new LinkedHashSet<Integer>();
		alist.add(2);
		alist.add(4);
		alist.add(null);
		alist.add(null);
		
		
		alist.add(0);
		alist.add(1);
		alist.add(2);
		alist.remove(0);
		System.out.println(alist);
		alist.add(null);
		System.out.println(alist);
	}

}
