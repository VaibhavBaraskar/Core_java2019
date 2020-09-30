//36.	WAP to shuffle elements in an ArrayList
package com.hefshine.collection_list;

import java.util.*;

public class Hw36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList a1=new ArrayList();
		System.out.println("How many element you want? ");
		int size=sc.nextInt();
		System.out.println("Enter the element: ");
		for(int i=0;i<size;i++)
		{
		a1.add(sc.next());
		}
		System.out.println("Element in linked list before shuffle: "+a1);
		Collections.shuffle(a1);
		System.out.println("Element in linked list after shuffle: "+a1);
	}
}
