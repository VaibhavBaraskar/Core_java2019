//6.	Write a program to find all roots of a quadratic equation. 
package com.hefshine.control_Statements;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double b,a,c;
		double des,root,root1,root2;
		System.out.println("Enter the coeificient quadratic equation");
		b=sc.nextInt();
		a=sc.nextInt();
		c=sc.nextInt();
		des=Math.pow(b, 2)-4*a*c;
		root=Math.sqrt(des);
		if(des>0)
		{
			root1=(-b+root)/2*a;
			root2=(-b-root)/(2*a);
			System.out.println("Roots are "+root1+" and "+root2);
		}
		else if(des==0)
			System.out.println("Roots are "+-b/(2*a));
		else
			System.out.println("Roots are "+-b/(2*a)+"i"+(Math.sqrt(-des)/(2*a))+ " and "+-b/(2*a)+" -i "+(Math.sqrt(-des)/(2*a)));
	}

}
