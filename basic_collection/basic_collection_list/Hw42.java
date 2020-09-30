//42.	WAP to shuffle the elements in a linked list.
package com.hefshine.collection_list;

import java.util.*;

public class Hw42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Linked List Before Shuffle: " + l1);
		Collections.shuffle(l1);
		System.out.println("Linked List After Shuffle: " + l1);
	}
}