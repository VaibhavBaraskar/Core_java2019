//2.	Explain the concept of method overriding with an example.
package com.hefshine.basic_polymorphism_encapsulation;

import java.util.Scanner;

public class MethodOverriding {

	void MethodOveride(String name,String last)
	{
		System.out.println("first name is: "+name+"\nLast name is: "+last);
	}
}
class override extends MethodOverriding
{
	void MethodOveride(String name,String last)
	{
		System.out.println("first name is: "+name+"\nLast name is: "+last);
	}
	
	public static void main(String[] args) {

		MethodOverriding obj = new override();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String f_nm = sc.nextLine();
		System.out.println("Enter last name: ");
		String l_nm = sc.nextLine();
		
		obj.MethodOveride(f_nm, l_nm);
	}

}
