//5.	WAP to add user defined objects of type Employee in a HashSet using duplicate Employee object.
package com.hefshine.basic_collection_set;


import java.util.HashSet;

public class Cw05 {

	public static void main(String[] args) {
		Employee em = new Employee(1, "Onkar");
		Employee em1 = new Employee(1, "Onkar");
		HashSet h1 = new HashSet();
		h1.add(em);
		h1.add(em1);
		System.out.println(h1);

	}

}

