//1.	What will happen if compare method returns only +1. Show example.
//2.	What will happen if compare method always returns -1. Show example
//3.	What will happen if compare method always returns 0; Show example.

package com.hefshine.collections_sort;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
//		return 0;
//		return 1;
		return -1;
	}

}

public class ReturnPositive1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet tr = new TreeSet(new MyComparator());
		System.out.println("How many elements you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements:(Integers Only)");
		for(int i=0;i<size;i++)
		{
			tr.add(sc.nextInt());
		}
		System.out.println("Elements in tree set is: "+tr);
	}

}
