//49.	WAP to convert a linked list to array list.
package com.hefshine.collection_list;

import java.util.*;

public class Hw49 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want in linked list: ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Elements in linked list is: "+l1);
		ArrayList a1=new ArrayList(l1);
		System.out.println("Elements in array list is: "+a1);
	}
}
