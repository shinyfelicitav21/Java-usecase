package com.srm.lab02.java;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrListToStringArr {
	public static void main(String[] args) {
		System.out.println("CONVERTING ARRAYLIST TO STRING ARRAY.");
		System.out.println("-------------------------------------");
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Earphones");
        arrayList.add("Bluetooth");
        arrayList.add("Laptop");
        arrayList.add("Mouse");
        arrayList.add("Webcam");
        String[] strArray = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("String array elements:");
        System.out.println(Arrays.toString(strArray));
	}
}
