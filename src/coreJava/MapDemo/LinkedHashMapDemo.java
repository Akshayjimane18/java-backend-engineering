package coreJava.MapDemo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Iterator<Entry<String,String>> it=wd.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Iterator<String> itk=wd.keySet().iterator();
		while(itk.hasNext()){
			System.out.println(itk.next());
		}
	}

}
