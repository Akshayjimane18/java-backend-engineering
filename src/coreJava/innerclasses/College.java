package coreJava.innerclasses;

public class College {
	public int cid ;
	private static String CollegeName="J.V.M Mehta";
	public void setData(){
		System.out.println("In setData Method");
		cid=101;
		System.out.println("the id is "+cid);
	}
		private class Department{
			private int departmentid=102;
			
			void setDepartment(){
				System.out.println("In Department Method ");
				System.out.println("the departement id is "+departmentid);
				
				
		}
		
		
	}
	
	

	public static void main(String[] args) {
		College c=new College();
		Department d=c.new Department();
		c.setData();
		d.setDepartment();
		
		// TODO Auto-generated method stub
		

	}

}
