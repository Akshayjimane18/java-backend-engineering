package coreJava.staticMethod;

import java.util.Scanner;

public class Circle {
	 final int radius;
	
	double areaCircle;
	static final double pie;
	{
		radius=25;
		System.out.println("In instance initializer block");
	}
	
	Scanner s=new Scanner(System.in);
	Circle(){
		
		}
	
	
	
	
	 static void setShape()
	{
		System.out.println("Shape of circle is round");
		
		
		
		
	}
	 static
	 {
		  pie=3.142;
	 }
	public void area()
	
	{
		System.out.println("enter the radius of circle");
		//radius=s.nextInt();
		areaCircle=pie*radius*radius;
		System.out.println("area of circle is ="+areaCircle);
		
	}
	public static void main(String[]args)
	{
		Circle c= new Circle();
		c.area();
		Circle.setShape();
		Circle c1= new Circle();
		c1.area();
		Circle.setShape();
	}

}
