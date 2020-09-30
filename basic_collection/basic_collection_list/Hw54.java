//54.	WAP to retain all elements from ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw54 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want in first array list: ");
		int size = sc.nextInt();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("Elements in a array list is: " + a1);
		ArrayList a2 = new ArrayList();
		
		System.out.println("How many element you want in second array list: ");
		size = sc.nextInt();

		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a2.add(sc.nextInt());
		}
		System.out.println(a1.retainAll(a2));
		System.out.println("after retaning  array list second from array list first new arraylist is "+a2);
	}
}