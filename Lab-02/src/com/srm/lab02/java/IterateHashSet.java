package com.srm.lab02.java;
import java.util.HashSet;
import java.util.Iterator;
public class IterateHashSet {
	public static void main(String[] args) {
		System.out.println("ITERATING THROUGH HASHSET/SET.");
		System.out.println("------------------------------");
		 HashSet<String> hash = new HashSet<String>();
		 hash.add("David");
		 hash.add("Raj");
		 hash.add("Tom");
		 hash.add("Riyaz");
		 hash.add("Alen");
	     Iterator<String> iterator = hash.iterator();
	     while( iterator.hasNext()){
	        System.out.println( iterator.next());
	     }
	}
}
