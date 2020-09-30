//40.	WAP to create a new ArrayList, add some colors (string) and print the collection.
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many color you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the colors: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.next());
		}
		System.out.println("Elelemtns in array list is: "+a1);
	}
}
