package coreJava.Collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;



public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>alist=new ArrayList<Integer>();
		alist.add(2);
		alist.add(4);
		
		alist.add(0);
		alist.add(1);
		System.out.println(alist);
		int e=alist.get(2);
		alist.add(0,13);
		alist.remove(1);
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
		}
		
		
		
		

	}

}
