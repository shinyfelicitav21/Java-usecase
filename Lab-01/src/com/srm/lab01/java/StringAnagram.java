package com.srm.lab01.java;
import java.util.Arrays;
import java.util.Scanner;
public class StringAnagram {
    public static void main(String[] args) {
    	System.out.println("CHECKING STRING ANAGRAM.");
		System.out.println("------------------------");
    	String str1,str2;
	System.out.println("Enter the strings to check anagram : ");
    Scanner sc = new Scanner(System.in);
    str1  = sc.nextLine();
   str2  = sc.nextLine();
    if (str1.replaceAll(" ", "").length() == str1.replaceAll(" ", "").length()) {
        char[] charArray1 = str1.toLowerCase().toCharArray(); 
        char[] charArray2 = str1.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("The input strings are anagram.");
        } else {
            System.out.println("The input strings are not anagram!");
        }
    } 
    }
	}


