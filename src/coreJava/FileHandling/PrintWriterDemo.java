package coreJava.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=null;
		PrintWriter pw=null;
		
			String s="Coder technology,vashi";
			String s1="Squad Infotech , Nerul";
			String name="Rahul";
			int age=23;
			int lucyno=007;
			try{
			f=new File("akki.txt");
			pw=new PrintWriter(f);
			pw.println(s);
			pw.append(s1);
			pw.flush();
			pw.println();
			pw.printf("Hello I am %s. My age is %d. My lucky number is %d. Good bye..",name,age,lucyno);
					pw.flush();
					}
					catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
					finally {
					pw.close();
					}
			}
			
		
		

	}


