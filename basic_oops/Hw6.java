package com.hefshine.polymorphism_encapsulation;
//6.	Create a class Cycle with member variables: int accountNo, int noOfWheels. 
//Create a default constructor with a SOP in it “I am default constructor “Create another constructor which takes 2 arguments,
//calls the default constructor using this () and has a SOP in it “I am another constructor”. 
//In main method, create an object of type Cycle by using default constructor. 
//Note the output. Create another object of type Cycle by using the parameterized constructor. 
//Note the sequence of SOPs indicating that inner most constructors are called first.//
 class Cycle1
{
	int acc,wheels;
	Cycle1()
	{
		System.out.println("i am default constructor");
	}
	Cycle1(int a,int b)
	{
		this();
		System.out.println("i am another constructor");
	}
}

public class Hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cycle1 c=new Cycle1();
		Cycle1 c1=new Cycle1(1,2);

	}

}
