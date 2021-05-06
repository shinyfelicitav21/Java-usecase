package com.srm.lab01.java;
import java.util.Scanner;
public class AllPermutations {
		static void Permutation(String str, String ans)
	    {
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	        for (int i = 0; i < str.length(); i++) {
	         char ch = str.charAt(i);
	            String ros = str.substring(0, i) + 
	                         str.substring(i + 1);
	            Permutation(ros, ans + ch);
	        }
	    }
	    public static void main(String[] args)
	    {
	    	System.out.println("PRINTING ALL PERMUTATIONS IN A STRING.");
		System.out.println("------------------------------------------");
	        String s1,ans;
	        Scanner sc = new Scanner(System.in);
	   	   System.out.println("Enter the string:");
	   	 s1=sc.nextLine();
	 	System.out.println("Possible permutations:");
			 Permutation(s1, "");
	    }
}