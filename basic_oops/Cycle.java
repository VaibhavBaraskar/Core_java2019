/*6.Create a class Cycle with member variables: int accountNo, int noOfWheels.
 *Create a default constructor with a SOP in it “I am default constructor
 *“Create another constructor which takes 2 arguments, 
 *calls the default constructor using this () and has a SOP in it “I am another constructor”. 
 *In main method, create an object of type Cycle by using default constructor. Note the output. Create another object of type Cycle by using the parameterized constructor.
 *Note the sequence of SOPs indicating that inner most constructors are called first.*/
package com.hefshine.polymorphism_encapsulation; 

public class Cycle {
	
	int acc_no;
	int no_of_wheels;
	
	public Cycle() 
	{

		System.out.println("I am in default constructor of cycle class");
	}
	public Cycle(int acc_no,int no_of_wheels)
	{
		this();
		this.acc_no = acc_no;
		this.no_of_wheels = no_of_wheels;
		System.out.println("\nI am in PArameterized constructor "+acc_no+" "+no_of_wheels);
	}
}
class main5
{
	public static void main(String args[]) 
	{
		Cycle obj2 = new Cycle();
		Cycle obj = new Cycle(101,111);
		
	}
}