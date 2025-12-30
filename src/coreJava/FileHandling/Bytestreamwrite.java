package coreJava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Bytestreamwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		OutputStream fos=null;
		try{
			fos=new FileOutputStream("demo.txt");
			String s="Coder Tech";
			byte b[]=s.getBytes();
			try {
				fos.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Context Successfully");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("Exception caught");
			fe.printStackTrace();
		}
		finally{
			fos.close();
		}

	}

}
