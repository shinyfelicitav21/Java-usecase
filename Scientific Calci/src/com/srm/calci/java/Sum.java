package com.srm.calci.java;
import java.util.Scanner;
public class Sum{
		public void Sum() {
			int a,b,c;
			Scanner sc=new Scanner(System.in);
		System.out.println("SUM OF NUMBERS.");
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum:"+c);
	}
}
