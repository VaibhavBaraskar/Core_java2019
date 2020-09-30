//8.	WAP to set or replace an element using set().
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Kalpesh");
		l1.add("Hefshine");
		System.out.println(l1);
		System.out.println("Enter the index to set element: ");
		int in=sc.nextInt();
		if(in>=0 && in <=3)
				l1.set(in, "HELLO");
			else
			System.out.println("Something went wrong......Enter the index between 0 to 3");
		System.out.println(l1);
	}
}
