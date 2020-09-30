//34.	WAP to remove first and last element from a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw34 {
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
		l1.removeFirst();
		l1.removeLast();
		System.out.println("after remove first & last element in linked list"+l1);
		
	}
}
