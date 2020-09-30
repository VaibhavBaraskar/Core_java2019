//4.	WAP to add user defined objects of type Employee in a HashSet. Print the contents in the Set.
package com.hefshine.basic_collection_set;

import java.util.HashSet;

public class Cw04 {

	public static void main(String[] args) {
		Employee em = new Employee(1, "Onkar");
		Employee em1 = new Employee(2, "Rushi");
		HashSet h1 = new HashSet();
		h1.add(em);
		h1.add(em1);
		System.out.println(h1);

	}

}
