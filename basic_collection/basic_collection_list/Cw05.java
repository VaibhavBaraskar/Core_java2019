//5.	WAP to retrieve an element (at a specified index) from a given ArrayList
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Kalpesh");
		l1.add("Hefshine");
		System.out.println(l1);
		System.out.println("Enter the index to retrive element: ");
		int in=sc.nextInt();
		if(in>=0 && in <=3)
			System.out.println(l1.get(in-1));
		else
			System.out.println("Something went wrong......Enter the index between 1 to 4");
	}

}
