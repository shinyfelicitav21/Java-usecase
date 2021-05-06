package com.srm.lab01.java;
import java.util.Scanner;
public class DuplicateChar {
	public static void main(String[] args) {
		System.out.println("FINDING DUPLICATE CHARACTERS IN A STRING.");
		System.out.println("----------------------------------------");
		String str;
		System.out.println("Enter the string:");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		  int count = 0;
		  char[] ch = str.toCharArray();
		  System.out.println("Original string:" + str);
		  System.out.println("Duplicate characters:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (ch[i] == ch[j]) {
		     System.out.println(ch[j]);
		     count++;
		     break;
		    }
		   }
		  }
	}
}
