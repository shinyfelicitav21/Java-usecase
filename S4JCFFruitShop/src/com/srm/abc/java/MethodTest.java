package com.srm.abc.java;
import java.util.ArrayList;
import java.util.List;
public class MethodTest {
	public void addData(List list) {
		System.out.println("Fetching!!!");
		for(int i=0;i<list.size();i++) {
			System.out.println(list);
		}
	}
	public void bubbleSortArrayList (List<Fruit> list) {
		Fruit temp;
		    boolean sorted = false;
		    while (!sorted) {
		        sorted = true;
		        for (int i = 0; i < list.size()-1; i++) {
		            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
		                temp = list.get(i);
		                list.set(i, list.get(i + 1));
		                list.set(i + 1, temp);
		                sorted = false;
		            }
		        }
		    }
	}
	}
	
        
    
