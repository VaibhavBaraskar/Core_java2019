//23.	WAP to trim the capacity of an ArrayList the current list size
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("Elements in array list: " + a1);
		System.out.println("Size of array list is: "+a1.size());
		a1.trimToSize();
		System.out.println("Elements in array list: " + a1);
		System.out.println("Size of array list is: "+a1.size());
	}

}
