package coreJava.bulkoperation;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class BulkOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s=new LinkedHashSet<Integer>();
		s.add(0);
		s.add(1);
		s.add(5);
		s.add(6);
		s.add(8);
		s.add(7);
		s.add(4);
		System.out.println(s);
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(1);
		s1.add(52);
		s1.add(85);
		s1.add(58);
		s1.add(45);
		s1.add(8);
		System.out.println(s1);
		boolean b=s.retainAll(s1);
		System.out.println(b);
		
		System.out.println();
		 s.addAll(s1);
		 System.out.println(s);
		 s.removeAll(s1);
		 System.out.println(s);
		 s.containsAll(s1);
		 System.out.println(s);
		 List<Integer> l=new ArrayList<Integer>();
		 l.add(1);
		 l.add(2);
		 l.add(3);
		 l.add(5);
		 System.out.println(l);
		 Set<Integer> s2=new HashSet<Integer>(l);
		 System.out.println(s2);
		 
		
	}

}
