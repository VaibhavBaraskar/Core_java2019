//1.	Generate Fibonacci series for first n terms.
package com.hefshine.basic_iteration;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int num = sc.nextInt();
		int t1 = 0, t2 = 1;
        System.out.print("First " + num + " terms: ");

        for (int i = 1; i <= num; ++i)
        {
            System.out.print(t1 + "  ");
            
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

	}

}
