package com.srm.calci.java;
import java.util.Scanner;
public class CubeRoot {
	public void CbrtRoot() {
		Scanner sc=new Scanner(System.in);
		System.out.println("FINDING CUBE ROOT.");
		System.out.println("Enter the number:");
		int d1 = sc.nextInt();
		double cbr=Math.cbrt(d1);
		System.out.println("Cube root of  "+d1+" : "+cbr);
		System.out.println("----------------------");
	}
}
