package com.srm.lab01.java;
import java.util.Scanner;
public class RemoveWhiteSpace {
	public static void main(String[] args) {
		System.out.println("REMOVING ALL WHITE SPACES.");
		System.out.println(("-------------------------"));
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string:");
	    String str = sc.nextLine();
        System.out.println("Original String : \"" + str + "\"");
        System.out.println("Replaced String: \"" + str.replace(" ", "") + "\"");
	    sc.close();
	}
}
