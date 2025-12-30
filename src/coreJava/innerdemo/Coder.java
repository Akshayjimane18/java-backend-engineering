package coreJava.innerdemo;

public class Coder {
	public int cId;
	private static String InstituteName ="Coder";
	public void setData(){
		System.out.println("In setData Method");
		cId=101;
		CT16 c=new CT16();
		c.setStudent();
		System.out.println("the student id ="+c.stdId);
		
		
		
		
		
	}
	 class CT16{
		private int stdId;
		String stdName;
		void setStudent(){
			System.out.println("in setstudent method");
			System.out.println( InstituteName);
			System.out.println(cId);
			
			stdId=102;
			stdName="";

}
}
}