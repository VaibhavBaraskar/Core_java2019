//8.	WAP to match two collections
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw08 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		ArrayList l2 = new ArrayList();
		l2.add("Onkar");
		l2.add("Rushi");
		System.out.println(l1.equals(l2));
	}
}
