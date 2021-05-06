package com.srm.lab01.java;
import java.util.HashMap;
import java.util.Scanner;
public class NonRepeated {
	public static void main(String [] args) {
		System.out.println("FIRST NON-REPEATED CHARACTER IN A STRING.");
		System.out.println("-----------------------------------------");
		String str;
		  System.out.println(" Enter the input string :" );
		  Scanner sc=new Scanner(System.in);
         str=sc.nextLine();
        char c=firstNonRepeatedCharacter(str);
        System.out.println("First non repeated character :  " + c);
    }
    public static Character firstNonRepeatedCharacter(String str) {
        HashMap<Character,Integer>  hash= new HashMap<Character ,Integer>();
        int i,len ;
        Character c ;
        len= str.length(); 
        for (i=0;i < len;i++)
        {
            c=str.charAt(i);
            if(hash.containsKey(c))
            {
            	hash.put(  c ,  hash.get(c) +1 );
            }
            else
            {
            	hash.put( c , 1 ) ;
            }
        }
        for (i =0 ; i < len ; i++ )
        {
            c= str.charAt(i);
            if( hash.get(c)  == 1 )
            return c;
        }
        return null ;
	}
}
