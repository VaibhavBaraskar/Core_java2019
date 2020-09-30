/*14.	WAP to create Emp (id,name,sal) object and add 2 objects to ArrayList. 
 Sysout and see both variable memory space is printed. 
 This is because toString is not overriden but if you would have done this for Integer then beautiful output
 would have been printed.
a.Now override toString for earlier assignment and now sysout and see values are printed
b.WAP to print Emp whose salary is > 10000
c.WAP to print Emp who have name "Sachin"
d.WAP to print Emp who have highest number of salary
*/

package com.hefshine.basic_collections_list;

import java.util.*;

class Employee1 {
	int id;
	String name;
	String dept;
	double salary;

	Employee1(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

	public void display1(Employee1[] e) {
		for (int i = 0; i < e.length; i++) {
			if (e[i].salary >= 10000) {
				System.out.println("employee whose salary greter than 10000 are:: " + e[i]);
			}
		}
	}

	public void display2(Employee1[] e) {
		for (int i = 0; i < e.length; i++) {
			if ((e[i].name).equalsIgnoreCase("Sachin")) {
				System.out.println(" employee whose name is sachine are::  " + e[i]);
			}
		}
	}

	public void display3(Employee1[] e) {
		double max = e[0].salary;
		for (int i = 0; i < e.length; i++) {
			if (max < e[i].salary) {
				max = e[i].salary;
			}
		}
		// System.out.println("employee have maximum salary is:: " + max);
		for (int i = 0; i < e.length; i++) {
			if (max == e[i].salary) {
				System.out.println("employee have maximum salary is::  " + e[i] + " with salary:: " + max);
			}
		}
	}

}

public class Cw14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList al = new ArrayList();

		Employee1 e[] = new Employee1[3];
		Employee1 obj = new Employee1();
		for (int i = 0; i <= 2; i++) {
			System.out.println("Enter employee id: ");
			Integer id = sc.nextInt();
			System.out.println("Enter emplyee name: ");
			String name = sc.next();
			System.out.println("Enter emplyee dept: ");
			String dept = sc.next();
			System.out.println("Enter emplyee salary: ");
			double salary = sc.nextDouble();

			al.add(new Employee1(id, name, dept, salary));
			e[i] = new Employee1(id, name, dept, salary);

		}

		System.out.println("arraylist is:" + al);

		System.out.println("size of arraylist is:  " + al.size());
		obj.display1(e);
		obj.display2(e);
		obj.display3(e);
	}
}