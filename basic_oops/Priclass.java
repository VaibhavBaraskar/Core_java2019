/*2.	In the above example, declare the method of the parent class as private 
and then repeat the first two operations (You will get error in the third).*/
package com.hefshine.polymorphism_encapsulation;

public class Priclass {

	private Priclass()
	{
		System.out.println("private m1() in parent class");
	}
	
	private  Priclass(int a)
	{
		System.out.println("private m2() in parent class ");
	}
}
//	private void m3()
//	{
//		System.out.println("private m3() in parent class");
//	}
////}
////class child extends Priclass
//{
//	
//}