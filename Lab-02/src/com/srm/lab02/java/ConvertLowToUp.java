package com.srm.lab02.java;
import java.util.Scanner;
public class ConvertLowToUp {
	public static void main(String[] args) {
		System.out.println("CONVERTING LOWERCASE TO UPPER WITHOUT BUILT-IN METHOD.");
		System.out.println("------------------------------------------------------");
		Scanner sc=new Scanner(System.in);
		  String str1,str2="";
		  char ch = ' ';
		  System.out.println("Enter your string(Lower case):");
		  str1=sc.nextLine();
		  str1+='\0';
		  int i=0;
		     while(str1.charAt(i)!='\0')
		     {
		      if(str1.charAt(i)>96 && str1.charAt(i)<123 ) // or if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
		          ch=(char)(str1.charAt(i)-32);
		         else
		          ch=(char)(str1.charAt(i));
		         str2+=ch;
		         i++;
		     }
		     System.out.println("");
		     System.out.println("Original string:"+str1);
		  System.out.println("Upper case string: "+str2);
		  sc.close();
	}
}
