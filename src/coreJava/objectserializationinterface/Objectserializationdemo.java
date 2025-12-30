package coreJava.objectserializationinterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

public class Objectserializationdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		
		
		
		try{
		Book b=new Book();
		b.setBookid(101);
		b.setBookname("Core Java");
		b.setBookprize(400);
		fos=new FileOutputStream("book.ser");
		oos=new ObjectOutputStream(fos);
		oos.writeObject(b);
		System.out.println("serialization successfully");
		}
		catch(NotSerializableException ns){
			System.out.println("Exception caught");
			ns.printStackTrace();
		}
		catch(FileNotFoundException ffe){
			System.out.println("Exception caught");
			ffe.printStackTrace();
		}
		catch(IOException io){
			System.out.println("Exception caught");
			io.printStackTrace();
		}
		finally{
			fos.close();
		}
		

	}

}
