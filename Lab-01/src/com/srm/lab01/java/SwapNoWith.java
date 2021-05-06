package com.srm.lab01.java;
import java.util.Scanner;
public class SwapNoWith {
	public static void main(String[] args) {
		System.out.println("SWAPPING TWO NUMBERS WITH THIRD VARIABLE.");
		System.out.println("----------------------------------------");
		int x, y, temp;
	      System.out.println("Enter the values of x and y:");
	      Scanner sc = new Scanner(System.in);
	      x = sc.nextInt();
	      y = sc.nextInt();
	      System.out.println("Before Swapping:\nx = "+x+"\ny = "+y);
	      temp = x;
	      x = y;
	      y = temp;
	      System.out.println("After Swapping:\nx = "+x+"\ny = "+y);
	}
}
