//52.	WAP to replace an element in a linked list
package com.hefshine.collection_list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Hw52 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList l1 = new LinkedList();
		System.out.println("How many element you want?");
		int size = sc.nextInt();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Elements in a linked list is: "+l1);
		System.out.println("Enter the location and element to replace: ");
		l1.set(sc.nextInt()-1, sc.nextInt());
		System.out.println("After replce an element linked list is: "+l1);
	}
}
