//6.	WAP to insert an element into the ArrayList at the first position
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw06 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Hefshine");
		l1.add(0, "Hello");
		System.out.println(l1);
	}
}
