package coreJava.objectserializationinterface;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		InputStream fis=null;
		Book b=null;
		try{
		fis=new FileInputStream("book.ser");
		ois=new ObjectInputStream(fis);
		
		
			b = (Book)ois.readObject();
			System.out.println(b);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
