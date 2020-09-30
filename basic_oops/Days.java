//3.	Write a program to input month number and print number of days in that month. {Hint- Input-11 Output-30 }
package com.hefshine.oops;
import java.util.Scanner;
public class Days {
			void month(int month)
			{
				if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
					System.out.println("Month is "+month+" Days in "+month+"'th month is 31");
				else if(month==2)
					System.out.println("Month is "+month+" Days in "+month+"'th month is 28");
				else
					System.out.println("Month is "+month+" Days in "+month+"'th month is 30");
			}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Days object=new Days();
	System.out.println("Enter the month");
	int month=sc.nextInt();
	if (month>=1 && month<=12)
		object.month(month);	
	else
		System.out.println("Enter the month between 1 to 12");
	}

}
