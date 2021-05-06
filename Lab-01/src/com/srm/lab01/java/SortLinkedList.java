package com.srm.lab01.java;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
public class SortLinkedList {
	public static void main(String[] args) {
		System.out.println("SORTING LINKED LIST.");
		System.out.println("--------------------");
		 LinkedList<String> ll = new LinkedList<>( Arrays.asList("RE", "Pulsar", "R15", "KTM")); 
		 System.out.println("Before sorting: " + ll); 
		ll.sort(Comparator.reverseOrder()); 
		 System.out.println("After sorting: " + ll);
	}
}
