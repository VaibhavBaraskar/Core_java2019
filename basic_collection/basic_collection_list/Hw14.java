//14.	WAP to iterate through all elements in a linked list starting at the specified position.
package com.hefshine.collection_list;

import java.util.*;

public class Hw14 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want?");
		int size = sc.nextInt();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}	
		System.out.println("Elements in a linked list is: " + l1);
		System.out.println("Enter the position: ");
		int ind = sc.nextInt();

		Object arr[] = l1.toArray();

		for (int i = ind - 1; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
