//3.	WAP to check if the ArrayList is empty or not.
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw03 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		System.out.println(l1.isEmpty());
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Hefshine");
		l1.add("Software");
		System.out.println(l1.isEmpty());
		System.out.println("Array list element is: "+l1);
		}
}
