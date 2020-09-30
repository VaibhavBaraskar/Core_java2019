/*6.	Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics   and Computer. Calculate percentage and grade according to following: 
a.	Percentage >= 90% : Grade A 
b.	Percentage >= 80% : Grade B 
c.	Percentage >= 70% : Grade C 
d.	Percentage >= 60% : Grade D 
e.	Percentage >= 40% : Grade E 
f.	Percentage < 40% : Grade F  
*/
package com.hefshine.basic_control_statement;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double physics,chemistry,biology,mathematics,computer;
		System.out.println("Enter the five subject marks out of 100");
		System.out.println("physics");
		physics=sc.nextInt();
		System.out.println("chemistry");
		chemistry=sc.nextInt();
		System.out.println("biology");
		biology=sc.nextInt();
		System.out.println("mathematics");
		mathematics=sc.nextInt();
		System.out.println("computer");
		computer=sc.nextInt();
		double per=(((physics+chemistry+biology+mathematics+computer)*100)/500);
		System.out.println("Percentage: "+per);
		if(per<100 && per>90)
		{
			System.out.println("Grade A");
		}
		else if(per<90 && per>70) 
		{
			System.out.println("Grade B");
		}
		else if(per<70 && per>50)
		{
			System.out.println("Grade C");
		}
		else if(per<50 && per>30)
		{
			System.out.println("Grade E");
		}
		else 
		{
			System.out.println("Fail");
		}
	}

}
