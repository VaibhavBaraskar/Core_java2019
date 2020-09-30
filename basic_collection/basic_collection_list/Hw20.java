//20.	WAP to join two ArrayLists.
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw20 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("First Array: " + a1);
		ArrayList a2 = new ArrayList();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		System.out.println("Second Array: " + a2);
		a2.addAll(a1);
		System.out.println("After join two arraylist: " + a2);
	}
}