//5.	WAP to clear all objects from ArrayList.
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw05 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Hefshine");
		l1.add("Software");
		System.out.println("After add element in array list: \t"+l1);
		l1.clear();
		System.out.println("\nAfter clear all objects from array list: \t"+l1);
	}
}
