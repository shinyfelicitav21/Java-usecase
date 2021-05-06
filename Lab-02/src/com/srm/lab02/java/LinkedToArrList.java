package com.srm.lab02.java;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LinkedToArrList {
	public static void main(String[] args) {
		System.out.println("CONVERTING LINKED LIST TO ARRAY LIST.");
		System.out.println("-------------------------------------");
		LinkedList ll = new LinkedList();
	    ll.add("Royal Enfield");
	    ll.add("Pulsar");
	    ll.add("R15");
	    ll.add("Duke");
	    List myList = new ArrayList(ll);
	    System.out.println("ArrayList Elements:\n");
	    for (Object bike : myList)
		System.out.println(bike);
	}
}
