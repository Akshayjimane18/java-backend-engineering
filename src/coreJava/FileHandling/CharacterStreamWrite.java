package coreJava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharacterStreamWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Writer fw = null;
		try{
			fw=new FileWriter("Coder.txt");
			String s="Coder Technology";
			char c[]=s.toCharArray();
			fw.write(c);
			fw.flush();
			System.out.println("context successfully");
		}
		catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
		catch(IOException ie){
			ie.printStackTrace();
		}
		finally{
			fw.close();
		}

	}

}
