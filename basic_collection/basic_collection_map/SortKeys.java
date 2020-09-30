//11.	WAP to sort keys in TreeMap by using comparator
package com.hefshine.collections_map;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

class MyComparator3 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1=(Integer)o1;
		Integer I2=(Integer)o2;
		if(I1<I2)
		return 1;
		else if(I1>I2)
			return -1;
		else
			return 0;
	}
	
}
public class SortKeys {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements: \n");
		TreeMap tr = new TreeMap(new MyComparator3());
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element "+(i+1)+" in treemap: ");
			System.out.println("Enter the key:(Integers Only) ");
			int key = sc.nextInt();
			System.out.println("Enter the value:(Strings Only) ");
			String value = sc.next();
			tr.put(key, value);
		}
		System.out.println(tr);
	}

}
