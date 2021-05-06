package com.srm.lab01.java;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("CHECKING STRING PALINDROME.");
		System.out.println("---------------------------");
		String str1,str2 = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        str1 = sc.nextLine();
        int n = str1.length();
        for(int i = n - 1; i >= 0; i--)
        {
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("The given string is palindrome.");
        }
        else
        {
            System.out.println("The given string is not palindrome!");
        }
	}
}
