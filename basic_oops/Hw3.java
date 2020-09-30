package com.hefshine.polymorphism_encapsulation;
//3.	Create Academy class with appropriate attributes (instance variable) and create getter & setter methods.
class Academy1
{
	String name;
	int id;
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
}
public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Academy1 ob=new Academy1();
ob.setId(11);
ob.setName("coej");
System.out.println("academy name is  "+ob.getName());
System.out.println("institute id is"+ob.getId());
	}
}
	