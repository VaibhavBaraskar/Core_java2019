//5.	WAP to sort the elements of List that contains String objects.PrintArrayList.Sort using Collections.sort(list) method
package com.hefshine.collections_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
	System.out.println("How many elements you want?");
	int size=sc.nextInt();
	System.out.println("Enter the elements:(Strings only) ");
	for(int i=0;i<size;i++)
	{
		al.add(sc.next());
	}
	System.out.println("Elements in array list is: "+al);
	Collections.sort(al);
	System.out.println("Elements in array list is after sorting: "+al);
	}

}
