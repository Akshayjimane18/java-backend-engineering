package coreJava.Collection;


import java.util.Collections;
import java.util.HashSet;

import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>alist=new HashSet<Integer>();
		alist.add(2);
		alist.add(4);
		alist.add(null);
		alist.add(null);
		
		
		alist.add(0);
		alist.add(1);
		alist.add(2);
		alist.remove(0);
		System.out.println(alist);
		/*int e=alist.get(2);
		alist.add(0,13);
		
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		for(Integer a:alist){
			System.out.println(a);
		}
		for(int i=0;i<alist.size();i++){
			System.out.print(alist.get(i));
		}
		System.out.println(alist);
		Iterator<Integer> it= alist.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
	}

}
