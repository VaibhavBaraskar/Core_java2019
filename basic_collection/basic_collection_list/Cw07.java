//7.	WAP to get an element of a particular Index.
package com.hefshine.basic_collections_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Cw07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Kalpesh");
		l1.add("Hefshine");
		System.out.println(l1);
		System.out.println("Enter the index to add element: ");
		int in = sc.nextInt();
		if (in >= 0 && in <= 3)
			l1.get(in);
		else
			System.out.println("Something went wrong......Enter the index between 0 to 3");
		System.out.println(l1);
	}
}
