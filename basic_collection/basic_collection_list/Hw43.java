//43.	WAP to join two linked lists.
package com.hefshine.collection_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Hw43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want in first linked list? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("First Linked List: " + l1);
		LinkedList l2 = new LinkedList();
		System.out.println("How many element you want second linked list? ");
		size = sc.nextInt();
		System.out.println("Enter the element: ");
		l2.addAll(l1);
		for (int i = 0; i < size; i++) {
			l2.add(sc.nextInt());
		}
		System.out.println("Linked List After Join Two Linked List: " + l2);
	}

}
