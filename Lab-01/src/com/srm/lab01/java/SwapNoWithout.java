package com.srm.lab01.java;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class SwapNoWithout {
	public static void main(String [] args)
	{
		System.out.println("SWAPPING TWO NUMBERS WITHOUT THIRD VARIABLE.");
		System.out.println("-------------------------------------------");
		System.out.println("Enter the values of x and y:");
		Scanner sc=new Scanner(System.in);
		  int x = sc.nextInt(); 
		  int y =sc.nextInt() ;
		  System.out.println("Numbers before swapping:" +x+"  "+y);  
		  x = x + y;  
		  y = x - y;  
		  x = x - y;  
		  System.out.println("Numbers after swapping:" +x+"  "+y);  
		 }
	}

