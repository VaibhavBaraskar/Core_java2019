//1.	WAP to retrieve and remove the lowest element of a TreeSet using a single method call. Repeat the same using 2 different method calls.
package com.hefshine.basic_collection_set;

import java.util.*;

public class Cw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t1 = new TreeSet<>();
		t1.add(20);
		t1.add(10);
		t1.add(30);
		t1.add(40);
		t1.add(50);
		System.out.println(t1);
		System.out.println("Lowest element removed is: " + t1.pollFirst());
		System.out.println(t1);
		System.out.println("Lowest element removed is: " + t1.remove(t1.first()));
		System.out.println(t1);
	}

}
