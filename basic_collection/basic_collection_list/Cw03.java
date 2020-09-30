//3.	WAP to search an element from ArrayList
package com.hefshine.basic_collections_list;

import java.util.ArrayList;

public class Cw03 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add(13);
		System.out.println(l1);

		System.out.println(l1.get(1));
	}
}
