//44.	WAP to clone a linked list to another linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw44 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Elements in first linked list is: "+l1);
		LinkedList l2=(LinkedList)l1.clone();
		System.out.println("Elelemnts in second linked list is: "+l2);
	}
}
