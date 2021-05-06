package com.srm.lab02.java;
import java.util.Scanner;
public class OccurenceOfChar {
	   static void countEachChar(String str) {
		int counter[] = new int[256]; 
		int len = str.length(); 
		for (int i = 0; i < len; i++) 
			counter[str.charAt(i)]++; 
		char array[] = new char[str.length()]; 
	        for (int i = 0; i < len; i++) { 
		   array[i] = str.charAt(i); 
		   int flag = 0; 
		   for (int j = 0; j <= i; j++) { 
			if (str.charAt(i) == array[j])  
				flag++;                 
		   } 
		   if (flag == 1)  
		      System.out.println("Occurrence of char " + str.charAt(i)
			 + ":" + counter[str.charAt(i)]);             
		} 
	   } 
	   public static void main(String[] args) 
	   {  
		   System.out.println("COUNTING OCCURENCES OF CHAR IN A STRING..");
			System.out.println("----------------------------------------");
		String str ; 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
		countEachChar(str); 
	}
}
