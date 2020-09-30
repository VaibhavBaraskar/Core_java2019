/*10.	Scenario: A kids laptop manufacturer needs to develop a laptop which will display a message first,
Enter Option:
Add-1
Subtract-2
Multiply-3
Quit-4
The kid should be allowed to enter an option. If the kid enters 1, a message needs to be displayed, 
“Enter two numbers to be added”.
The kid should be allowed to enter two numbers (In two separate lines).
Based on the numbers entered, the program should add and display the result as below
“The result is <result>”
After the result is displayed, the program should loop back and ask for the next menu entry. If the kid enters  4, the program should quit. (The program needs to be executed and do either one of the options  until the kid enters the option 4)
Problem Statement:
Create a class ScannerLaptopDemo.java with a main method which performs the required operations as specified above. 
Algorithm:
1.Display message as specified to print the various options 1 to 4.
2.On user enters one of the option based on the input the appropriate arithmetic operation is done as mentioned below.
3.Using switch statement, display the appropriate message.
Example if option is 1 “Enter two numbers to be added”, get the two numbers using Scanner class and print the added result.
If option is 2 “Enter two numbers to be subtracted”, get the two numbers using Scanner class and print the subtracted result.
If option is 3 “Enter two numbers to be multiplied”, get the two numbers using Scanner class and print the multiplied result.
If option is 4 terminate the program.
Perform step 1 to 3 in a do-while loop (while option != 4).
*/
package com.hefshine.oops;
import java.util.Scanner;
public class KidCalculator {
	Scanner sc=new Scanner(System.in);
	int number1,number2,result;
	void addition()
				{
					
					System.out.println("Enter the first number");
					number1=sc.nextInt();
					System.out.println("Enter the second number");
					number2=sc.nextInt();
					result=number1+number2;
					System.out.println("Result= "+result);
				}
				void substraction()
				{
					System.out.println("Enter the first number");
					number1=sc.nextInt();
					System.out.println("Enter the second number");
					number2=sc.nextInt();
					result=number1-number2;
					System.out.println("Result= "+result);	
				}
				void multiplication()
				{
					System.out.println("Enter the first number");
					number1=sc.nextInt();
					System.out.println("Enter the second number");
					number2=sc.nextInt();
					result=number1*number2;
					System.out.println("Result "+result);
				}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		KidCalculator object=new KidCalculator();
		char ch;
		do
		{
		System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Quit");
				System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		
		switch(choice)
		{
		case 1:object.addition();
				break;
		case 2:object.substraction();
				break;
		case 3:object.multiplication();
				break;
		case 4:System.out.println("Exit!!!!!!!");
		System.exit(0);
		default:System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue (y/n)");
		ch=sc.next().charAt(0);
		}while(ch=='y');
		System.out.println("Exit!!!!!!!");
	}

}
