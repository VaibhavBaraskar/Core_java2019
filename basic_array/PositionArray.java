//8.	WAP to insert an element in a specific position into an array.
package com.hefshine.array;
import java.util.Scanner;
public class PositionArray {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array: ");
			int size=sc.nextInt();
			int numbers[]=new int[size+1];
			System.out.println("Enter the elements in array: ");
			for(int i=0;i<size;i++)
			{
				numbers[i]=sc.nextInt();
			}
			System.out.println("Enter the position: ");
			int pos=sc.nextInt();
			System.out.println("Enter the number: ");
			int number=sc.nextInt();
			for(int i=(size-1);i>=(pos-1);i--)
			{
				numbers[i+1]=numbers[i];
			}
				numbers[pos-1]=number;
			for(int i=0;i<=size;i++)
			{
				System.out.println(" "+numbers[i]);
			}
	}
}