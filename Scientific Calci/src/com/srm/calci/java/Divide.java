package com.srm.calci.java;
import java.util.Scanner;
public class Divide {
	public void divide()
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("DIVIDE.");
		System.out.println("Enter the numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		z = x / y;
		System.out.println("Divided value:"+z);
		z=sc.nextInt();
		System.out.println("----------------------");
	}
}
