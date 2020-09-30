//5.	Write a program to input week number and print week day. 
package com.hefshine.basic_control_statement;
import java.util.Scanner;
public class WeekDay {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int number;
		System.out.println("Enter the number");
		number=sc.nextInt();
		switch(number)
		{
		case 1:System.out.println("You entered "+number+" Day is Monday");
				break;
		case 2:System.out.println("You entered "+number+" Day is Tuesday");
				break;
		case 3:System.out.println("You entered "+number+" Day is Wednesday");
				break;
		case 4:System.out.println("You entered "+number+" Day is Thursday");
				break;
		case 5:System.out.println("You entered "+number+" Day is Friday");
				break;
		case 6:System.out.println("You entered "+number+" Day is Saturday");
				break;
		case 7:System.out.println("You entered "+number+" Day is Sunday");
				break;
		default:System.out.println("You entered "+number+" Invalid choice:In a week only 7 days are present");
		}
	}

}
