//45.	WAP to remove and return the first element of a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw45 {
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
		System.out.println("first element removed from an linked list....\nThis element is: '"+l1.removeFirst()+"'.");
	}

}
