package com.srm.lab02.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayToArrayList {
	public static void main(String[] args) {
		System.out.println("CONVERTING ARRAY TO ARRAYLIST.");
		System.out.println("------------------------------");
		String array1[]={"Maldives", "Russia", "Pune", "Paris"};
	    ArrayList<String> arraylist= new ArrayList<String>();
	    System.out.println("ArrayList  elements:");
	    Collections.addAll(arraylist, array1);
	    arraylist.add("Thailand");
	    arraylist.add("Goa");
	    for (String str: arraylist)
	    {
	     
	 	System.out.println(str);
	    }
	}
}
