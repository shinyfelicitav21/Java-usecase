package com.srm.lab02.java;
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
	public static void main(String[] args) {
		System.out.println("SORTING AARAYLIST IN DESCENSING ORDER.");
		System.out.println("--------------------------------------");
		ArrayList<String> arraylist = new ArrayList<String>();
	    arraylist.add("Watermelon");
	    arraylist.add("Grapes");
	    arraylist.add("Muskmelon");
	    arraylist.add("Banana");
	    System.out.println("Before Sorting:");
	    for(String str: arraylist){
	   System.out.println(str);
	  }
	    System.out.println("-------------------");
	    Collections.sort(arraylist, Collections.reverseOrder());
	    System.out.println("After Sorting:");
	    for(String str: arraylist){
	   System.out.println(str);
	    }
	}
}
