//33.	WAP to remove a specified element from a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		LinkedList l1=new LinkedList();
		System.out.println("How many element you want? ");
		int size=sc.nextInt();
		System.out.println("Enter the element: ");
		for(int i=0;i<size;i++)
		{
		l1.add(sc.next());
		}
		System.out.println(l1);
		System.out.println("Enter the element to remove from linked list: ");
		String ele=sc.next();
		l1.remove(ele);
		System.out.println(l1);
	}

}
