package com.hefshine.polymorphism_encapsulation;
//4.	Create a class named 'Shape' with a method to print "This is shape class". 
//Then create  another class named 'Rectangle' inheriting the Shape class, having a method to print "This is rectangular shape" .
//Create another class ‘circle ‘inheriting ‘rectangle’ class and create a method to print  "This is circular shape" respectively.
//Now call the method of 'Shape' and 'Rectangle' class by the object of ‘circle’ class.
class shape
{
	void m1()
	{
		System.out.println("this is shape class");
	}
}
class rectangle extends shape
{
	void m2()
	{
		System.out.println("this is rectangle class");
	}
}
class circle extends rectangle
{
	void m3()
	{
		System.out.println("this is circular shape");
	}
}

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.m1();
		c.m2();
		c.m3();

	}

}
