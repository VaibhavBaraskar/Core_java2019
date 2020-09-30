package com.hefshine.basic_polymorphism_encapsulation;

import java.util.Scanner;

public class Encpasulation_Validation {

	private int age;
	private String name;
	private String Address;
	
	public void setAge(int age)
	{
		if(age!=0)
		{
		this.age=age;
		}
		else
		{
			System.out.println("Age2 must be greater than zero and not negative");
		}
	}
	int getAge()
	{

		return age;
	}
	public void setName(String name)
	{
		if(name.equals("null"))
		{
			System.out.println("Please enter the name properly");
			
		}
		else
		{
			this.name =  name;
		}

		
		}
	String getName()
	{
		return name;
	}
	public void setAddress(String Address)
	{
		if(Address.equals("null"))
		{
			System.out.println("Please enter the Address properly");
		}
		else
		{
			this.Address =  Address;
		
		}
		
	}
	String getAddress()
	{
		return Address;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age: ");
		int age= sc.nextInt();
		
		System.out.println("enter your address: ");
		String Address= sc.next();
		
		System.out.println("enter your name: ");
		String name= sc.next();
		
		Encpasulation_Validation obj = new Encpasulation_Validation();
		obj.setAddress(Address);
		obj.setAge(age);
		obj.setName(name);
		
		System.out.println(obj.getAge()+"\n");
		System.out.println(obj.getAddress()+"\n");
		System.out.println(obj.getName()+"\n");
		
		
	}

}
