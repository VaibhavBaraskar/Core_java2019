/*4.Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter. 
Print the data by creating objects of the class.*/
package com.hefshine.basic_polymorphism_encapsulation;

public class Employee_Encapsulation {
	private int emp_id;
	private String name;
	private double salary;
	

	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		Employee_Encapsulation obj = new Employee_Encapsulation();
		obj.setEmp_id(101);
		obj.setName("Rushikesh");
		obj.setSalary(20000);
		System.out.println("Employee id is: "+obj.getEmp_id());
		System.out.println("Employee name is: "+obj.getName());
		System.out.println("Employee salary is: "+obj.getSalary());

	}

}
