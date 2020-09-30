//4.	WAP to check if an element is present in ArrayList using Contains().
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw04 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Hefshine");
		l1.add("Software");
		System.out.println(l1.contains("Onkar"));
	}
}
