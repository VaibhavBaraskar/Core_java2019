//48.	WAP to check if a particular element exists in a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw48 {
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
		System.out.println("Enter the element to check it is exist or not: ");
		if(l1.contains(sc.nextInt()))
		{
			System.out.println("Element is present in given linked list ");
		}
		else
		{
			System.out.println("Elements is not present in given linked list ");
		}
	}
}
