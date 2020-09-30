//53.	WAP to remove all elements from ArrayList
package com.hefshine.collection_list;

import java.util.*;

public class Hw53 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want?");
		int size = sc.nextInt();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("Elements in a array list is: "+a1);
		a1.clear();
		System.out.println("Elements in a array list is: "+a1);
	}
}
