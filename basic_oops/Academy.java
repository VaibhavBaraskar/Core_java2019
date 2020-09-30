//3.	Create Academy class with appropriate attributes (instance variable) and create getter & setter methods.
package com.hefshine.polymorphism_encapsulation;

import java.util.Scanner;

public class Academy {
  private int studId;
  private String studName;
  
  
  public int getStudId() 
	{
	return studId;
	}
	public void setStudId(int studId) 
	{
	this.studId = studId;
	}
	public String getStudName() 
	{
	return studName;
	}
	public void setStudName(String studName) 
	{
	this.studName = studName;
	}
	
}

class Main
	{
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student id");
		int id=sc.nextInt();
		System.out.println("enter student name");
		String name=sc.next();
		
		Academy obj = new Academy();
		
		obj.setStudId(id);
		obj.setStudName(name);
		
		System.out.println(obj.getStudId());
		System.out.println(obj.getStudName());
		
		
	}

}
