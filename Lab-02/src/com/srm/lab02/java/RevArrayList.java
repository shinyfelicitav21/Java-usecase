package com.srm.lab02.java;
import java.util.ArrayList;
import java.util.Collections;
public class RevArrayList {
	public static void main(String [] args) {
		System.out.println("REVERSING ARRAY LIST.");
		System.out.println("---------------------");
	ArrayList al = new ArrayList(); 
    al.add("Shiny");         
    al.add("Sweety");        
    al.add("Sam");
    al.add("Shri");
    al.add("Deepa");         
    al.add("Kalai");
    System.out.println("Original ArrayList:");         
    System.out.println(al);
    Collections.reverse(al);
    System.out.println("-----------------------------------------");
    System.out.println("Reversed ArrayList:");         
    System.out.println(al);
}
}