//35.	WAP to remove all the elements from a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw35 {
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
		System.out.println("Element in linked list is: "+l1);
		l1.clear();
		System.out.println("after remove all element in linked list: "+l1);
		
	}
}
