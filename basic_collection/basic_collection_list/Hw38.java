//38.	WAP to extract a portion of an ArrayList
package com.hefshine.collection_list;

import java.util.*;

public class Hw38 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.next());
		}
		System.out.println("Total element in array list: "+a1);
		System.out.println("Enter the starting postion and ending position: ");
		System.out.println("Sub LIst Of Array List Is: "+a1.subList(sc.nextInt()-1, sc.nextInt()));
	}

}
