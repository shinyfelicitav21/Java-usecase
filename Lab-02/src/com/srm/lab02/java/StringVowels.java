package com.srm.lab02.java;
import java.util.Scanner;
public class StringVowels {
	public static void main(String[] args) {
		System.out.println("CALCULATING TOTAL NO.OF.VOWELS IN A STRING.");
		System.out.println("-------------------------------------------");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		int vowel=0;
		for (int i = 0; i < s.length(); i++) { 
                    if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='o') 
                       vowel++; 
		}
	System.out.println("Total no.of.vowels: " + vowel);
		}
	}


