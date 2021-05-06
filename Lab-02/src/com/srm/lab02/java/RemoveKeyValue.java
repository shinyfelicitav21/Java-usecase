package com.srm.lab02.java;
import java.util.HashMap;
public class RemoveKeyValue {
	public static void main(String[] args) {
		System.out.println("REMOVING KEYVALUE MAPPING FROM HASHMAP.");
		System.out.println("---------------------------------------");
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		    hashmap.put(101,"Kalai");
		    hashmap.put(212,"Valli");
		    hashmap.put(333,"Veera");
		    hashmap.put(414,"Thamarai");
		    hashmap.put(555,"Thendral");
		    hashmap.put(616,"Sindhu");
		    System.out.println("HashMap Elements: " + hashmap);
		    Object removedElement1 = hashmap.remove(212);
		    System.out.println("Element removed : " +removedElement1);
		    Object removedElement2 = hashmap.remove(414);
		    System.out.println("Element removed : " +removedElement2);
		    System.out.println("----------------------------");
		    System.out.println("After removed:");
		    System.out.println("HashMap Elements: " + hashmap);
	}

}
