//39.	WAP to iterate through all elements in an ArrayList using for each
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.next());
		}
		System.out.println("Elelemtns in array list is: ");
		for(Object i: a1)
		{
			System.out.print(i+" ");
		}
	}
}
