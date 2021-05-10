package com.srm.calci.java;
import java.util.Scanner;
public class SquareRoot {
	public void SqrtRoot() {
		Scanner sc=new Scanner(System.in);
		System.out.println("SQUARE ROOT OF A NUMBER.");
		System.out.println("Enter the number:");
		int d = sc.nextInt();
		double sqr=Math.sqrt(d);
		System.out.println("Square root of  "+d+" : "+sqr);
		System.out.println("----------------------");
	}
}
