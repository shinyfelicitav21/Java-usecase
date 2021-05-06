package com.srm.lab01.java;
import java.util.Scanner;
public class FactIeration {
	public static void main(String[] args) {
		System.out.println("FACTORIAL USING ITERATION.");
		System.out.println("--------------------------");
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer:\n");
		a=sc.nextInt();
		long fact = factorial(a);
        System.out.println("Factorial of " + a +":"+ fact);
    }
    public static long factorial(int a)
    {
        if (a >= 1)
            return a * factorial(a- 1);
        else
            return 1;
	}
}
