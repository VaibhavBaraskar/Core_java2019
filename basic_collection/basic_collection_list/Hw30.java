//30.	WAP to insert some elements at the specified position into a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Elements in linked list is: "+l1);
		System.out.println("Enter the position and it's element to add: ");
		l1.add(sc.nextInt()-1, sc.next());
		System.out.println("Element in linked list after add new element: "+l1);
	}
}
