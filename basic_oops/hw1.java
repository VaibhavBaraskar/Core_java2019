package com.hefshine.polymorphism_encapsulation;
//1.	Write a program to check whether constructors can override
class A
{
	A()
	{
		System.out.println("parent class constructor");
	}
}
class B extends A
{
	 B()
	{
		System.out.println("child class constructor");
	}
}

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B ob=new B();

	}

}
