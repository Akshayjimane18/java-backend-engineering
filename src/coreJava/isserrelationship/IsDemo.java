package coreJava.isserrelationship;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IsDemo {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		Address add=new Address();
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Employee id  ");
		int empId=sc.nextInt();
		System.out.println("Enter the Employee name");
		String empName=br.readLine();
		System.out.println("Enter the employee Address");
		System.out.println("Enter Apartement Name");
		String aptName=br.readLine();
		System.out.println("Enter the Flat No");
		int flatNo=sc.nextInt();
		System.out.println("Enter the Street ");
		String street=br.readLine();
		System.out.println("Enter the area");
		String area=br.readLine();
		add.setaptName(aptName);
		add.setFlatNo(flatNo);
		add.setStreet(street);
		add.setArea(area);
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setAdd(add);
		System.out.println(e);
		
		

	}

}
