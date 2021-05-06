package com.srm.lab02.java;
import java.util.Scanner;
public class DataTypeRange {
	public static void main(String[] args) {
		System.out.println("FINDING RANGE OF MAXIMUM AND MINIMUM VALUE OF DATATYPE.");
		System.out.println("-------------------------------------------------------");
		int a,b;
		 Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=sc.nextInt();
	System.out.println("Enter the second number:");
	b=sc.nextInt();
	System.out.println("");
	 System.out.printf("Max value: %d\n", Math.max(a, b));
     System.out.printf("Min value: %d\n", Math.min(a, b));
     System.out.printf("Range: %d\n", a- b);
	}
}
