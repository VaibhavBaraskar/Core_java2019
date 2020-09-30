//11.	WAP of swap two elements in an ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Hw11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	ArrayList a1 = new ArrayList();
	System.out.println("How many element you want?");
	int size = sc.nextInt();

	System.out.println("Enter the element: ");
	for (int i = 0; i < size; i++) {
		a1.add(sc.nextInt());
	}
	System.out.println("Array List: "+a1);
	System.out.println("Enter the two location to swap there element: ");
	Collections.swap(a1,sc.nextInt()-1,sc.nextInt()-1);
	System.out.println("Array List After Swaping: "+a1);
}
}
