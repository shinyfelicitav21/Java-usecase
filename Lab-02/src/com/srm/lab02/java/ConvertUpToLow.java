package com.srm.lab02.java;

import java.util.Scanner;
public class ConvertUpToLow {
	public static void main(String[] args) {
		System.out.println("CONVERTING UPPERCASE TO LOWER WITHOUT BUILT-IN METHOD.");
		System.out.println("------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		  String str1,str2=" ";
		  char ch = ' ';
		  System.out.println("Enter your string(Upper case):");
		  str1=sc.nextLine();
		  str1+='\0';
		  int i=0;
		     while(str1.charAt(i)!='\0')
		     {
		         if(str1.charAt(i)>64 && str1.charAt(i)<91 ) //or if(str1[i]>='A' && str1[i]<='Z')
		          ch=(char)(str1.charAt(i)+32);
		         else
		          ch=(char)(str1.charAt(i));
		         str2+=ch;
		         i++;
		     }
		     System.out.println("");
		     System.out.println("Original string:"+str1);
		  System.out.println("Lower case tring: "+str2);
		  sc.close();
	}
}
