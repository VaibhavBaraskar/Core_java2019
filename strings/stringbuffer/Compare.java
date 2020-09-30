//6.	Write a Java program to copy one string to another string.
package com.hefshine.stringbuffer;

import java.util.Scanner;

public class Compare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		StringBuilder ss = new StringBuilder(str);
//		ss.append(5);
//		System.out.println(ss);
//		sb.append(" Hello");
//		System.out.println(sb);

//		System.out.println(sb);

//		sb.replace(5, 9, "Java");
//		System.out.println(sb);

//		sb.delete(0, 5);
//		System.out.println(sb);

//		sb.reverse();
//		System.out.println(sb);

//		sb.capacity();
//		System.out.println(sb);
//
		sb.ensureCapacity(10);
		// System.out.println(sb);
	}

}
