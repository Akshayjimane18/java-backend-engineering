package coreJava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc,sc1=null;
		InputStreamReader isr=null;
		try{
			isr=new FileReader("akki.txt");
			sc=new Scanner(isr);
			while(sc.hasNext()){
				String s=sc.nextLine();
				sc1=new Scanner(s);
				while(sc1.nextLine() != null){
					if(sc1.hasNext()){
						System.out.println(sc1.nextLine());
					}
					else{
						sc1.next();
					}
				
				}
			}
			
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		

	}

}
