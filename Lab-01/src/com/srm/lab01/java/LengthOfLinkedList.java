package com.srm.lab01.java;
import java.util.LinkedList;
public class LengthOfLinkedList {
		    public static void main (String[] args) {
				System.out.println("FINDING LENGTH OF THE LINKEDLIST.");
				System.out.println("---------------------------------");
		    	LinkedList<String> list = new LinkedList<String>();
		        list.add("Kamal");
		        list.add("Sharon");
		        list.add("Chennai");
		        list.add("21");
		        list.add("Paris");
		        System.out.println("LinkedList elements:" + list);
		        System.out.println("Length of LinkedList:" + list.size());                                        
		    }
	}


