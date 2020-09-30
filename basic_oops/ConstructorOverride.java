//1.	Write a program to check whether constructors can override.
package com.hefshine.polymorphism_encapsulation;

import java.util.Scanner;

class EmployeeCon
{
	String firstName;
	String lastName;
	EmployeeCon()
	{
		 
	}
	EmployeeCon(String firstName,String lastName)
	{
		System.out.println(firstName);
		System.out.println(lastName);
	}
	
}
class DepartmentCon extends EmployeeCon
{    //override constructor is not possible in java
   /*  EmployeeCon()
	{
		 
	}*/
}


public class ConstructorOverride {
  
	public static void main(String[] args) {
		EmployeeCon obj = new EmployeeCon();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name: ");
		String fnm=sc.nextLine();
		System.out.println("enter last name: ");
		String lnm=sc.nextLine();
		EmployeeCon obj1 = new EmployeeCon(fnm,lnm);
		
	}

}
