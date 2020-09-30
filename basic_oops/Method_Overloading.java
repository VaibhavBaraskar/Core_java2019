//1.Explain the concept of method overloading with an example.
package com.hefshine.basic_polymorphism_encapsulation;

import java.util.Scanner;

public class Method_Overloading {
	
	void overloadMethod(int a,int b)
	{
		int sum=a+b;
		System.out.println("two para method of: "+a+" "+b+" = "+sum);
	}
	void overloadMethod(int a,int b, int c)
	{
		int sum=a+b+c;
		System.out.println("three para method of: "+a+" "+b+" "+c+" = "+sum);
		
	}
	void overloadMethod(double a,double b)
	{
		double sum=a+b;
		System.out.println("two para method of double of: "+a+" "+b+"= "+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for a");
		int a=sc.nextInt();
		System.out.println("enter value for b");
		int b=sc.nextInt();
		System.out.println("enter value for c");
		int c=sc.nextInt();
		System.out.println("enter value for x");
		double x=sc.nextDouble();
		System.out.println("enter value for y");
		double y=sc.nextDouble();
		
		Method_Overloading obj = new Method_Overloading();
		obj.overloadMethod(a, b);
		obj.overloadMethod(a, b,c);
		obj.overloadMethod(x, y);
		
	}

}
