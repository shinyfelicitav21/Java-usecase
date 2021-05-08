package com.srm.generics.java;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class MethodFruit {
	public void addData(Map<Integer, List<FruitGenerics>> hash) {
		System.out.println("--------------------");
		System.out.println("Sorted Details!!");
		for(int i=0;i<hash.size();i++)
		{
			System.out.println(hash);
		}
	}
	public void sortElements(ArrayList al) {
		Set<FruitGenerics> s = new TreeSet<FruitGenerics>();
	    s.addAll(al);
	    //for (FruitGenerics it : s) {
	      System.out.println(s);
	    }
	}

	
	
	
	
	
	
	