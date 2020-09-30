//24.	WAP to increase the size of an ArrayList
package com.hefshine.collection_list;

import java.util.*;

public class Hw24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("Elements in array list: " + a1);
		a1.ensureCapacity(10);
		// System.out.println(a1.size()
	}

}
