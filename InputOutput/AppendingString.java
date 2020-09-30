//5. Write a program to accept input from user. Append the contents to the existing file.
package com.hefshine.InputOutput;
import java.io.*;
import java.util.Scanner;
public class AppendingString
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br1 = new BufferedReader(new FileReader(new File("B:\\Hefshine\\Files\\Demo1.txt")));
		System.out.println("Previous data is:");
		String s1 = br1.readLine();
		System.out.println(s1);
		
		System.out.println("Enter string to append:");
		String s2 = sc.nextLine();
		
		BufferedWriter bw1 = new BufferedWriter(new FileWriter(new File("B:\\Hefshine\\Files\\Demo1.txt"),true));
		bw1.write(s2);
		bw1.flush();
		bw1.close();
		
		BufferedReader br2 = new BufferedReader(new FileReader(new File("B:\\Hefshine\\Files\\Demo1.txt")));
		System.out.println("Data after appending the entered string is:");
		String s3 = br2.readLine();
		System.out.println(s3);
	}
}
