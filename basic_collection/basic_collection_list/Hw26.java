//26.	WAP to remove the third element from an ArrayList
package com.hefshine.collection_list;

import java.util.*;

public class Hw26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList a1=new ArrayList();
		System.out.println("How many number you want?");
		int n=sc.nextInt();
		System.out.println("Enter the element: ");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			a1.add(num);
		}
		System.out.println("Array List Is"+a1);
		a1.remove(3-1);
		System.out.println("After Remove Third Element In An Array List: "+a1);
	}

}
