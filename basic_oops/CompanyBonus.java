/*9.	A company decided to give bonus of 5% to employees if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.*/
package com.hefshine.oops;
import java.util.Scanner;
public class CompanyBonus {
						void bonus(double salary,double year)
						{
							if(year>5)
							{
								double bonus=salary*0.05 ;
							System.out.println("Your salary after bonus is: "+(salary+bonus));
							}
							else
							{
								System.out.println("No bonus your salary is: "+salary);
							}
						}
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				CompanyBonus object=new CompanyBonus();
				System.out.println("Enter the salary");
				double salary=sc.nextDouble();
				System.out.println("Enter the year");
				double year=sc.nextDouble();
				object.bonus(salary, year);
	}

}
