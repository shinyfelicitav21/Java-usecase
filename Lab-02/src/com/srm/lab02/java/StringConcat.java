package com.srm.lab02.java;
import java.util.Scanner;
public class StringConcat {
	public static void main(String[] args) {
		System.out.println("STRING CONCATENATION.");
		System.out.println("---------------------");
		String str,str1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  first string:");
		str=sc.next();
		System.out.println("Enter the second string:");
		str1=sc.next();
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append(str).append(" ").append(str1); 
		System.out.println("Concatenated string:");
		System.out.println(sBuffer.toString());
	}
}
