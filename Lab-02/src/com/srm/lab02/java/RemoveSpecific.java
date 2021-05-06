package com.srm.lab02.java;
import java.util.Scanner;
public class RemoveSpecific {
	public static void main(String[] args) {
		System.out.println("REMOVING SPECIFIC CHARACTERS IN A STRING.");
		System.out.println("-----------------------------------------");
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=sc.nextLine();
        System.out.println("Enter the characters to be removed: ");
        Scanner scan =new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=removeSpecificChars(str, str1);
        System.out.println("Original string:"+ str);
        System.out.println("New string:"+str2);
    }
    public static String removeSpecificChars(String str ,String str1)
    {
        char[] ch=str.toCharArray();
        char[] removechararr=str1.toCharArray();
        int start,end=0;
        boolean[]  tempBoolean = new boolean[128];
        for(start=0;start < removechararr.length;++start)
        {
            tempBoolean[removechararr[start]]=true;
        }
        for(start=0;start < ch.length;++start)
        {
            if(!tempBoolean[ch[start]])
            {
               ch[end++]=ch[start];
            }
        }
        return new String(ch,0,end);
	}
}
