package com.srm.lab01.java;
import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
	Scanner scan = new Scanner(System.in);
	  void bubbleSort(int array[]) {
	    int size = array.length;
	    System.out.println("Choose Sorting Order:");
	    System.out.println("1 For Ascending \n2 For Descending");
	    int sortOrder = scan.nextInt();
	    for (int i = 0; i < size - 1; i++)
	      for (int j = 0; j < size - i - 1; j++)
	        if (sortOrder == 1) {
	          if (array[j] > array[j + 1]) {	      
	            int temp = array[j];
	            array[j] = array[j + 1];
	            array[j + 1] = temp;
	          }
	        }	      
	        else {	          
	          if (array[j] < array[j + 1]) {	            
	            int temp = array[j];
	            array[j] = array[j + 1];
	            array[j + 1] = temp;
	          }
	        }
	  }	  
	  public static void main(String args[]) {
		  System.out.println("IMPLEMENTATION OF BUBBLESORT ALGORITHM.");
			System.out.println("-------------------------------------");	    
	    int[] data = {22,98,-2,-94,7,9,-63,21,3,-60,-20,22,26,-61,57};
	    Scanner scan = new Scanner(System.in);
	    BubbleSort bs = new BubbleSort();	 	    
	    bs.bubbleSort(data);
	    System.out.println("Sorted Array:");
	    System.out.println(Arrays.toString(data));
	}
}

