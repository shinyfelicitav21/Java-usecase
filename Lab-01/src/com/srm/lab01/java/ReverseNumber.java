package com.srm.lab01.java;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		System.out.println("REVERSE A NUMBER.");
		System.out.println("-----------------");
		int a, rev = 0;
	    System.out.println("Enter the number:");
	    Scanner sc = new Scanner(System.in);
	    a = sc.nextInt();
	    while(a != 0)
	    {
	      rev = rev * 10;
	      rev = rev + a%10;
	      a = a/10;
	    }
	    System.out.println("Reversed number : " + rev);
	  }
	}


