//13.	WAP to insert the specified element at the specified position in the linked list.
package com.hefshine.basic_collections_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Cw13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList<>();
		System.out.println("How many number you want?");
		int n = sc.nextInt();
		System.out.println("Enter the element to be inserted in linked list: ");
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			l1.add(num);
		}
		System.out.println("Element in linked list is: " + l1);
		
		System.out.println("Enter the location: ");
		int loc = sc.nextInt();
		
		
		
		if (loc <= l1.size()) {
			System.out.println("Enter the element: ");
			int ele = sc.nextInt();
			l1.set(loc - 1, ele);

			System.out.println("Element in linked list is: " + l1);
		} else {
			System.out.println("Something went wrong......Enter location between!! 1 to "+l1.size());
		}

	}
}
