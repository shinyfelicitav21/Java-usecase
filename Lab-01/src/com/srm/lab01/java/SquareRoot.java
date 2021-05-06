package com.srm.lab01.java;
import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		 System.out.println("FINDING SQUARE ROOT WITHOUT INBUILT FUNCTION.");
		 System.out.println("---------------------------------------------");
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");     
        double num = sc.nextDouble();
	double result;
	double squareRoot = num / 2;
	do {
		result = squareRoot;
		squareRoot = (result + (num / result)) / 2;
	} 
	while ((result - squareRoot) != 0);
	System.out.println("Result:"+squareRoot);
    }   
	}


