package com.srm.lab02.java;
import java.util.Scanner;
public class WhiteSpace {
	public static void main(String[] args) {
		System.out.println("REMOVING WHITE SPACES IN A STRING.");
		System.out.println("---------------------------------");
		String str ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
        System.out.println("Original string: \n" + str);
        str = str.replaceAll("\\s", "");
        System.out.println("New string: \n" + str);
    }
}