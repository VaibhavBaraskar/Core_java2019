//9.	Write a program to input any character and check whether it is alphabet, digit or special character. 
package com.hefshine.control_Statements;
import java.util.Scanner;
public class CheckCharacter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	char input;
	System.out.println("Enter the input");
	input=sc.next().charAt(0);
	if((input>='a' && input<='z')||(input>='A' && input<='Z'))
		System.out.println("You enterd " +input+ " character");
	else if(input>='0' && input<='9')
			System.out.println("You entered " +input+ " digit");
	else
			System.out.println("You entered " +input+ " special character");
	}

}
