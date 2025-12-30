package coreJava.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharacterStreamRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i=0;
		Reader rd = null;
		try{
			rd=new FileReader("demo.txt");
			while(i!=-1){
				i=rd.read();
				if(i!=-1)//to stop print the end of file 
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
			rd.close();
		}
		}

	}


