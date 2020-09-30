//4.	Reverse an arraylist of 10 integers.
package com.hefshine.collections_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("How many elements you want?");
		int size=sc.nextInt();
		System.out.println("Enter the elements:(Integers Only) ");
		for(int i=0;i<size;i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Traverse array list is: "+al);
		Collections.reverse(al);
		System.out.println("Reverse array list is: "+al);
	}

}
