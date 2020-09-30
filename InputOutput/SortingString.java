//4. Write a program to read string names from file and sort and write those names in another file.
package com.hefshine.InputOutput;

import java.io.*;

public class SortingString {
	public static void main(String[] args) throws IOException {
		BufferedReader br1 = new BufferedReader(new FileReader(new File("B:\\Hefshine\\Files\\Demo2.txt")));

		System.out.println("Entered strings in file are:");
		String s1 = br1.readLine();
		System.out.println(s1);
		String s2[] = s1.split(" ");
		int res;
		String temp;
		for (int i = 0; i < s2.length; i++) {
			for (int j = i + 1; j < s2.length; j++) {
				res = s2[i].compareTo(s2[j]);
				if (res > 0) {
					temp = s2[i];
					s2[i] = s2[j];
					s2[j] = temp;
				}
			}
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("B:\\Hefshine\\Files\\Demo3.txt")));
		for (int i = 0; i < s2.length; i++) {
			bw.write(s2[i] + " ");
		}
		bw.flush();
		bw.close();
		// System.out.println("");
		BufferedReader br2 = new BufferedReader(new FileReader(new File("B:\\Hefshine\\Files\\Demo7.txt")));
		System.out.println("Sorted strings in Demo7 file are:");
		String str = br2.readLine();
		while (str != null) {
			System.out.print(str + " ");
			str = br2.readLine();
		}
		br2.close();
	}
}