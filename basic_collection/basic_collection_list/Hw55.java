//55.	WAP to know how many elements in ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw55 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList a1 = new ArrayList();
		a1.add(8);
		a1.add(2);
		a1.add(9);
		a1.add(6);
		a1.add(5);
		System.out.println("'" + a1.size() + "' elements present in array list.");
		System.out.println("Elements in a array list is: " + a1);
	}
}
