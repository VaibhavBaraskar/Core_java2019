/*2.Sort arraylist of employees in ascending order of their salaries. If salary is same , 
list should be in descending order of name.*/
package com.hefshine.basic_collections_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	float salary;

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "\nEmployee id=" + id + ", name=" + name + ", salary=" + salary;
	}

}

class MyComparator5 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee s1 = (Employee) o1;
		Employee s2 = (Employee) o2;

		String n1 = (String) s1.name;
		String n2 = (String) s2.name;

		Float S1 = (Float) s1.salary;
		Float S2 = (Float) s2.salary;

		if (S1 == S2) 
		{
			return n1.compareTo(n2);
			//return -1;
		}
		
		else if (S1 > S2)
			return 1;
		else if (S1 < S2)
			return -1;
		else
			return 0;
	

}
}

public class SortAscendingDescending {
	static int id;
	static String name;
	static float salary;

	static void input() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the id: ");
		id = sc.nextInt();
		System.out.println("Enter the name: ");
		name = sc.next();
		System.out.println("Enter the salary: ");
		salary = sc.nextFloat();
	}

	public static void main(String[] args) {
		input();
		Employee s1 = new Employee(id,name,salary);
		input();
		Employee s2 = new Employee(id,name,salary);
		input();
		Employee s3 = new Employee(id,name,salary);

		ArrayList a1 = new ArrayList();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		Collections.sort(a1, new MyComparator5());

		System.out.println(a1);
	}

}
