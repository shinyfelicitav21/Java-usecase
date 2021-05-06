package com.srm.lab01.java;
import java.util.Arrays;
import java.util.Scanner;
public class InsertionSort {
	 void insertionSort(int array[]) {
		    int size = array.length;
		    for (int step = 1; step < size; step++) {
		      int key = array[step];
		      int j = step - 1;
		      while (j >= 0 && key < array[j]) {
		        array[j + 1] = array[j];
		        --j;
		      }
		      array[j + 1] = key;
		    }
		  }
		  public static void main(String args[]) {
			  System.out.println("IMPLEMENTATION OF INSERTIONSORT ALGORITHM.");
			  System.out.println("------------------------------------------");
		    int[] data = { 22,-21,7,-2,-94,98,9,-26};
		    InsertionSort is = new InsertionSort();
		    is.insertionSort(data);
		    System.out.println("Sorted Array:");
		    System.out.println(Arrays.toString(data));
		  }
		}
		
