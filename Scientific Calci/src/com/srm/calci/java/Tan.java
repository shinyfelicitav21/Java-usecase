package com.srm.calci.java;
import java.util.Scanner;
public class Tan {
	public void tan() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("TAN VALUE.");
		System.out.println("Enter the number:");
		double d3 = sc.nextInt();
		d3=Math.toRadians(d3);
		System.out.println("Tan value :" +Math.cos(d3));
		System.out.println("----------------------");
	}
}
