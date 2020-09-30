/*11.	Write a program to input basic salary of an employee and calculate its Gross salary according to following: 
a.	Basic Salary <= 10000 : HRA = 20%, DA = 80% 
b.	Basic Salary <= 20000 : HRA = 25%, DA = 90% 
c.	Basic Salary > 20000 : HRA = 30%, DA = 95%  
*/
package com.hefshine.control_Statements;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		double salary,hra,da,gross;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a salary");
		salary=sc.nextDouble();
		if(salary<=10000 && salary>=0)
		{
			hra=(salary*20)/100;
			da=(salary*40)/100;
			System.out.println("Gross salary is: "+(salary+hra+da));
		}
		else if(salary<=20000 && salary>=10000)
		{
			hra=(salary*25)/100;
			da=(salary*90)/100;
			System.out.println("Gross salary is: "+(salary+hra+da));
		}
		else if(salary>20000)
		{
		hra=(salary*30)/100;
		da=(salary*95)/100;
		System.out.println("Gross salary is: "+(salary+hra+da));
	}
		else
		{
			System.out.println("Something wrong");
		}

}
}