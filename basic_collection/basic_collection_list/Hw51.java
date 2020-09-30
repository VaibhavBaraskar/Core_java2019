//51.	WAP to test a linked list is empty or not.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw51 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList l1 = new LinkedList();
		if(l1.isEmpty())
			System.out.println("Linked List Is Empty...");
		else
			System.out.println("Linked List Is Not Empty...");
		l1.add(1);
		l1.add(2);
//		if(l1.isEmpty())
//			System.out.println("Linked List Is Empty...");
//		else
//			System.out.println("Linked List Is Not Empty...");
	}
}
