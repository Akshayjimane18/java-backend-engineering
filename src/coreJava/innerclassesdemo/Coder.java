package coreJava.innerclassesdemo;



public class Coder {
	public int cId;
	private static String InstituteName ="Coder";
	public void setData(){
		System.out.println("In setData Method");
		cId=101;
		System.out.println(cId);
		
		class CT16{
			private int stdId;
			String stdName;
			void setStudent(){
				System.out.println("in setstudent method");
				System.out.println( InstituteName);
				stdId=102;
				System.out.println(stdId);
				
				
				stdName="";

			}
		}//inner
		CT16 c=new CT16();
		c.setStudent();
		System.out.println("the student id ="+c.stdId);
	}	//method
		
	
public static void main(String[]args){
	Coder c=new Coder();
	c.setData();
	
}
}
	 


