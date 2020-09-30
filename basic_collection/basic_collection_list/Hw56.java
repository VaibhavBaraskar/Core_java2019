//56.	WAP to test an ArrayList is empty or not
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw56 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList a1 = new LinkedList();
		if (a1.isEmpty())
			System.out.println("Array List Is Empty...");
		else
			System.out.println("Array List Is Not Empty...");
		a1.add(1);
		a1.add(2);
		if (a1.isEmpty())
			System.out.println("Linked List Is Empty...");
		else {
			System.out.println("Linked List Is Not Empty...");
			System.out.println("elements in array list is: " + a1);
		}
	}

}
