package coreJava.WordDictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Worddictionery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int choice=0;
		String string1,string2;
		Scanner sc=new Scanner(System.in);
		
		
		Map<String,String> wd=new LinkedHashMap<String,String>();
		wd.put("Bat", "It is toolkit by this we can play cricket\n");
		wd.put("jwellary shop","it's a place in which we can purchase gold\n");
		wd.put("rahane","it is one down batsman\n");
		wd.put("ishant sharma","it is night wathcman batsman\n");
		wd.put("sachin","it is a opener batsman\n");
		wd.put("sachin","it is master blaster");
		wd.put(null, null);
		wd.put(null, null);
		System.out.println(wd);
		Iterator<String> itk=null;
		Iterator<Entry<String,String>> it=null;
		Iterator<String> i=null;
		do{
		System.out.println("1:Add word & meaning\n2:Updated meaning of particular word\n3:Delete particular word & meaning\n4:Search Meaning\n 5:Display Dictionary");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("Enter your Word ");
			string1=sc.next();
			System.out.println("Enter your meaning");
			string2=sc.next();
			wd.put(string1, string2);
			System.out.println("Word and meaning added successfully");
			break;
			
			
		
		case 2:
			System.out.println("Enter your word");
			string1 =sc.next();
			itk=wd.keySet().iterator();
			while(itk.hasNext())
			{
				String string3=itk.next();
				if(string1.equals(string3)){
					System.out.println("Enter your new meaning");
					string2=sc.next();
					wd.put(string1, string2);
					break;
				}
			
			}
				break;
			
		case 3:
			System.out.println("Enter your word");
			string1 =sc.next();
			itk=wd.keySet().iterator();
			while(itk.hasNext())
			{
				String string3=itk.next();
				if(string1.equals(string3)){
					wd.remove(string1);
					break;
				}
			}
			
			break;
		case 4:
			System.out.println("Enter your word");
			string1 =sc.next();
			itk=wd.keySet().iterator();
			while(itk.hasNext())
			{
				String string3=itk.next();
				if(string1.equals(string3)){
					
					System.out.println(wd.get(string1));
					break;
				}
			
			}
			break;
			
		case 5:
			it=wd.entrySet().iterator();
			while(it.hasNext())
			
			{
				System.out.println(it.next());
			}
			break;
		}
		}while(choice!=5);
		
				
	

}
}
