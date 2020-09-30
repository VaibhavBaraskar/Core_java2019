//3.	WAP to create a HashSet with some colors (String) 
package com.hefshine.collection_set;

import java.util.*;

public class Hw03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs= new HashSet();
		System.out.println("How many colors to added: ");
		int n=sc.nextInt();
		System.out.println("Enter the colors: ");
		for(int i=0;i<n;i++) {
		String color=sc.next();
			hs.add(color);	
		}
		System.out.println(hs);
		
	}

}
