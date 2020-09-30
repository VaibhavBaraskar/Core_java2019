//27.	WAP to insert elements into the linked list at the first and last position.
package com.hefshine.collection_list;

import java.util.*;
public class Hw27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1=new LinkedList();
		System.out.println("Enter the element into first position: ");
		int f1=sc.nextInt();	
		l1.addFirst(f1);
		System.out.println("Enter the element into last position: ");
		int f2=sc.nextInt();
		l1.addLast(f2);
		System.out.println(l1);
	}

}
