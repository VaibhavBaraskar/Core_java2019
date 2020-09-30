/*1.	WAP to create a class Student with (rollNo, name and age).
Create 3 Comparator implementations for each Student attribute (i.e. rollNo, name and age)*/
package com.hefshine.basic_collections_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class Stud {
	int rollNo;
	String name;
	int age;

	public Stud(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
}

class RollNo implements Comparator {

	public int compare(Object o1, Object o2) {

		Stud r1 = (Stud) o1;
		Stud r2 = (Stud) o2;
		Integer R1 = (Integer) r1.rollNo;
		Integer R2 = (Integer) r2.rollNo;

		if (R1 > R2)
			return 1;
		else if (R1 < R2)
			return -1;
		else
			return 0;
	}

}

class Name implements Comparator {

	public int compare(Object o1, Object o2) {
		Stud s1 = (Stud) o1;
		Stud s2 = (Stud) o2;

		String S1 = (String) s1.name;
		String S2 = (String) s2.name;

		Integer l1 = S1.length();
		Integer l2 = S2.length();
		if (l1 > l2)
			return 1;
		else if (l1 < l2)
			return -1;
		else
			return 0;

	}

}

class Age implements Comparator {

	public int compare(Object o1, Object o2) {
		Stud a1 = (Stud) o1;
		Stud a2 = (Stud) o2;

		Integer A1 = (Integer) a1.rollNo;
		Integer A2 = (Integer) a2.rollNo;
		if (A1 < A2)
			return 1;
		else if (A1 > A2)
			return -1;
		else
			return 0;
	}

}

public class Student {

	public static void main(String[] args) {
		Stud s1 = new Stud(3, "Rushi", 10);
		Stud s2 = new Stud(2, "Avi", 20);
		Stud s3 = new Stud(1, "Pravin", 30);
		ArrayList a1 = new ArrayList();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		TreeSet tr = new TreeSet(new RollNo());
		tr.addAll(a1);
		 System.out.println(tr);
		TreeSet tr1 = new TreeSet(new Name());
		tr1.addAll(a1);
		 System.out.println(tr1);
		TreeSet tr2 = new TreeSet(new Age());
		tr2.addAll(a1);
		 System.out.println(tr2);
	}

}
