package com.srm.lab02.java;
import java.util.HashSet;
import java.util.Scanner;
public class UniqueChar {
	public static void main(String[] args) throws Exception {
		System.out.println("FINDING UNIQUE CHARACTERS IN A STRING.");
		System.out.println("-------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:"); 
		String str = sc.nextLine(); 
		System.out.println("String value:"+str);
		if (isUnique(str))
		{ 
			System.out.println("All characters of a string are unique!"); 
		} 
		else { System.out.println("All characters of a string are not unique."); 
		}
		sc.close(); 
		} 
	 public static boolean isUnique(String input)
	 {
		 HashSet<Character> hash = new HashSet<>();
		    char[] ch = input.toCharArray();
		    for (Character c : ch)
		    { if (!hash.add(c))
		    { return false; 
		    } 
		    } 
		    return true;
	}
}
