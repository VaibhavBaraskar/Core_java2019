//2.	WAP to Remove an element in an ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw02 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Hefshine");
		l1.add("Software");
		System.out.println(l1);
		System.out.println("Removed Element is: "+l1.remove(1));
		System.out.println(l1);
		}
}
