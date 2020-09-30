//50.	WAP to compare two linked lists.
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Hw50 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want in first linked list: ");
		int size = sc.nextInt();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}

		System.out.println("Elements in linked list is: " + l1);

		System.out.println("How many element you want in second linked list: ");
		size = sc.nextInt();

		LinkedList l2 = new LinkedList();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l2.add(sc.nextInt());
		}

		System.out.println("Elements in linked list is: " + l2);
		if(l1.equals(l2))
		{
			System.out.println("First And Second Linked List Are Equal");
		}
		else
		{
			System.out.println("First And Second Linked List Are Not Equal");
		}
	}
}
