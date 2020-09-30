//31.	WAP to get the first and last occurrence of the specified elements in a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw31 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	LinkedList l1=new LinkedList();
	System.out.println("How many element you want? ");
	int size=sc.nextInt();
	System.out.println("Enter the element: ");
	for(int i=0;i<size;i++)
	{
	l1.add(sc.nextInt());
	}
	System.out.println("Element in list is: "+l1);
	System.out.println("Enter the element to get the first and last occurences of element: ");
	int ele=sc.nextInt();
	System.out.println("First occurences in linked list is: "+l1.indexOf(ele));
	System.out.println("Last occurences in linked list is: "+l1.lastIndexOf(ele));
}
}
