//12.	WAP to append the specified element to the end of a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList l1=new LinkedList();
		l1.addFirst(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		System.out.println("Before add element");
		System.out.println(l1);
		System.out.println("Enter element to add end of linked list: ");
		int ele=sc.nextInt();
		l1.addLast(ele);
		System.out.println("After add element");
		System.out.println(l1);
	}

}
