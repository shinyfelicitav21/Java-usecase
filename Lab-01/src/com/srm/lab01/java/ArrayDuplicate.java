package com.srm.lab01.java;
import java.util.Arrays;
public class ArrayDuplicate {
	public static int[] removeDuplicates(int[] intArr){
	    int i = 1;
	    int j = 0;
	    Arrays.sort(intArr);
	    System.out.println("Sorted array with duplicates:");
	    for(int x : intArr){
	      System.out.print(x+" ");
	    }
	    while(i < intArr.length){
	      if(intArr[i] == intArr[j]){
	        i++;
	      }else{
	        intArr[++j] = intArr[i++];
	      }   
	    }
	    int[] output = Arrays.copyOf(intArr, j+1);
	    return output;
	  }
	  public static void main(String[] args) {
		  System.out.println("REMOVING DUPLICATES FROM ARRAY.");
			System.out.println("-----------------------------");
	    int[] intArr = {21,94,-2,94,9,9,98,-7,22,26};
	    int[] outArr = removeDuplicates(intArr);
	    System.out.println("");
	    System.out.println("New Array:");
	    for(int i : outArr){
	      System.out.print(i+" ");
	    }
	  }
}


