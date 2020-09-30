//4.	WAP to show the implementation and use of local, instance and static variables in different context.
package com.hefshine.basic_oops;

public class Implementation {
	int a=4;
	static int b=7;
	void local() {
		int a=87;
		System.out.println("Value of local variable: "+a);
		
	}
	public static void main(String[] args) {

		Implementation object1=new Implementation();
		object1.local();
		System.out.println("Value of instance variable is: "+object1.a);
		System.out.println("Value of static variable is: "+b);
	}

}
