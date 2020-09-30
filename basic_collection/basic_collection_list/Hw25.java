//25.	WAP to Remove an element in an ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Hw25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("Enter the element to remove from an given array list: ");
		// int ele=sc.nextInt();
		a1.remove(a1.indexOf(sc.nextInt()));
		System.out.println("Array List After Removing Specified Element:" + a1);
	}

}
