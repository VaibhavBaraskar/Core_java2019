/*1.WAP to add elements to a HashMap without using generics (ie do not use <>) and print content of it.
Use Integer as Key and String as Value. In second HashMap add elements of String type as Key and Integer as Value.*/
package com.hefshine.basic_collections_map;
import java.util.*;
public class Cw01 {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first hash map: ");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value"+(i+1));
			System.out.println("\nEnter the key(Integer Only): ");
			int key=sc.nextInt();
			System.out.println("Enter the value(String only): ");
			String value=sc.next();
			hm.put(key,value);
		}
		
		HashMap hm1 = new HashMap();
		System.out.println("Enter the size of second hash map: ");
		size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the value"+(i+1));
			System.out.println("\nEnter the key(String Only): ");
			String key=sc.next();
			System.out.println("Enter the value(Integer only): ");
			int value=sc.nextInt();
			hm1.put(key,value);
		}
		System.out.println("Values in hashmap is: \n");
		System.out.println("First Hashmap is: \n"+hm);
		System.out.println("Second Hashmap: \n"+hm1);
	}

}
