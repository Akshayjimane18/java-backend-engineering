package coreJava.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BysteStreamRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i=0;
		InputStream fis=null;
		
		try{
			fis=new FileInputStream("demo.txt");
			while(i!=-1){
				i=fis.read();
				//if(i!=-1)//to stop print the end of file 
					System.out.print((char)i);
			}
			
		}
		catch(FileNotFoundException fe){
			System.out.println("Exception caught");
			fe.printStackTrace();
		}
		catch(IOException ie){
			System.out.println("Exception caught");
			ie.printStackTrace();
		}
		finally{
			fis.close();
		}
		
	}

}
