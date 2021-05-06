package com.srm.lab02.java;
import java.util.Scanner;
public class NoOfWords {
	public static void main(String[] args) {
		System.out.println("COUNTING NO.OF.WORDS IN A STRING.");
		System.out.println("---------------------------------");
		String str;
        int countWords=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        str=sc.nextLine();
        for(int i=0; i<str.length()-1; i++)
        {
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                countWords++;
        }
        System.out.println("String value:"+str);
        System.out.println("Total no.of.words:"+ (countWords+1));
	}
}
