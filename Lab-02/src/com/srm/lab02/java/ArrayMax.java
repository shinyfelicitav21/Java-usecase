package com.srm.lab02.java;
import java.util.Scanner;
public class ArrayMax {
	public static void main(String[] args) {
		System.out.println("MAXIMUM VALUE IN ARRAY.");
		System.out.println("-----------------------");
		int n, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of.elements in array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
	}
}
