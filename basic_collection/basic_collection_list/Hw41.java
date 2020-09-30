//41.	WAP to remove element from ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1 = new ArrayList();
		System.out.println("How many element you want? ");
		int size = sc.nextInt();
		System.out.println("Enter the element: ");
		for (int i = 0; i < size; i++) {
			a1.add(sc.nextInt());
		}
		System.out.println("Elelemtns in array list is: "+a1);
		System.out.println("Enter the index to remove element from an array list: ");
		int ind=sc.nextInt();
		a1.remove(ind-1);
		System.out.println("After remove '"+ind+"' index element. \nArray list is:"+a1);
	}

}
