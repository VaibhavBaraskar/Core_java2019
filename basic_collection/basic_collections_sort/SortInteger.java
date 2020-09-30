//6.	Sort arraylist of integers without using sort method.
package com.hefshine.collections_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class MyComparator1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		if (I1 > I2) {
			return 1;
		} else if (I1 < I2) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class SortInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("How many elements you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements:(Integers only) ");
		for (int i = 0; i < size; i++) {
			al.add(sc.nextInt());
		}
		TreeSet tr = new TreeSet(new MyComparator1());
		tr.addAll(al);
		System.out.println(tr);
	}

}
