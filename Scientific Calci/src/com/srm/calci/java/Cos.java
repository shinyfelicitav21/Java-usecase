package com.srm.calci.java;
import java.util.Scanner;
public class Cos {
	public void cos() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("COS OF A NUMBER.");
		System.out.println("Enter the number:");
		double d2 = sc.nextInt();
		d2=Math.toRadians(d2);
		System.out.println("Cos value :" +Math.cos(d2));
		System.out.println("----------------------");
	}
}
