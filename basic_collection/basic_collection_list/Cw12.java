//12.	WAP to iterate a linked list in reverse order.
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1 = new LinkedList<>();
		System.out.println("How many number you want");
		int n = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < n; i++) {

			l1.add(sc.nextInt());
		}
		System.out.println("reverse order of linked list: ");

		Iterator l = (Iterator) l1.descendingIterator();

		while (l.hasNext()) {
			System.out.print(l.next() + " ");
		}
	}

}
