package com.srm.lab01.java;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		System.out.println("REVERSE A STRING.");
		System.out.println("-----------------");
		int i,a;
		 String s1;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string:");
		 s1=sc.nextLine();
		 char str[] = s1.toCharArray();
		     a=str.length;
		     System.out.println("Original string:"+s1);
		     System.out.println("Reversed string:");
		     for(i=a-1;i>=0;i--)
		     {
		       System.out.print(str[i]);
		     }
	}
}
