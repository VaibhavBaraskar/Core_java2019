//32.	WAP to display the elements and their positions in a linked list.
package com.hefshine.collection_list;

import java.util.LinkedList;
import java.util.Scanner;

public class Hw32 {
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
	System.out.println(l1);
	Object arr[]=l1.toArray();
	for(int i=0;i<size;i++)
	{
		System.out.println("Index '"+i+"' Element '"+arr[i]+"'");
	}
}
}
