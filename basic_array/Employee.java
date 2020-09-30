/*15.	WAP to print the details of employees from Employee[] array who has same salary
(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)*/
package com.hefshine.array;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	float salary;
	public Employee(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		Employee e1=new Employee(1,"Rushi",2000);
		Employee e2=new Employee(2,"Anil",2000);
		Employee e3=new Employee(3,"Sunil",4000);
		Employee[] emp= new Employee[] {e1, e2, e3};
		Salary sal=new Salary();
		sal.display(emp);
	}

}


class Salary
{
	public void display(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].salary==emp[j].salary) {
					System.out.println("Employee id: "+emp[i].id+" Employee name:"+emp[i].name+"Employee salary:" +emp[i].salary);
					System.out.println("Employee id: "+emp[j].id+" Employee name:"+emp[j].name+"Employee salary:" +emp[j].salary);
			}
		}
		}
	}
}