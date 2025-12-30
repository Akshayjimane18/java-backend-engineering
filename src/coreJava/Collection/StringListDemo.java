package coreJava.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class StringListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>alist=new ArrayList<String>();
		alist.add("a");
		alist.add("k");
		
		alist.add("s");
		alist.add("h");
		System.out.println(alist);
		String e=alist.get(2);
		System.out.println(e);
		alist.add(0,"a");
		alist.remove(1);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println(alist);
		for(String a:alist){
			System.out.println(a);
		}
		for(int i=0;i<alist.size();i++){
			System.out.print(alist.get(i));
		}
		System.out.println(alist);
		int p=Collections.binarySearch(alist,"s");
		System.out.println(p);
		ListIterator<String> lit=alist.listIterator();
		System.out.println("Forward");
		while(lit.hasNext()){
			System.out.println(lit.next());
			
		}
		System.out.println("Backword");
		while(lit.hasPrevious()){
			System.out.println(lit.previous());
			
		}
	}

}
