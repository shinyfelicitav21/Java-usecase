package com.srm.lab02.java;
import java.util.Arrays;
import java.util.HashSet;
public class ArrayIntersection {
	public static void main(String[] args) {
		System.out.println("FINDING INTERSECTION BETWEEN TWO ARRAYS.");
		System.out.println("----------------------------------------");
		Integer[] firstArray = {5,6,7,8,9,2};
	    Integer[] secondArray = {2,4,6,8,10,12,14,16,18,20};
	    HashSet<Integer> hash = new HashSet<>(); 
	    hash.addAll(Arrays.asList(firstArray));
	    hash.retainAll(Arrays.asList(secondArray));
	    System.out.println("Intersected values:" +hash);
	    Integer[] intersection = {};
	    intersection = hash.toArray(intersection);
	    System.out.println(Arrays.toString(intersection));
	  }
}

