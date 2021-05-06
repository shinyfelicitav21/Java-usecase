package com.srm.lab01.java;
import java.util.Scanner;
public class FactorialRec {
	public static void main(String[] args) {
		System.out.println("FACTORIAL USING RECURSION.");
		System.out.println("--------------------------");
		int a, mul;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer:\n");
        a = sc.nextInt();
        FactorialRec fac = new FactorialRec();
        mul = fac.fact(a);
        System.out.println("Factorial of "+a+":"+mul);
    }
    int fact(int a)
    {
        if(a > 1)
        {
            return(a * fact(a - 1));
        }
        return 1;
	}

}
