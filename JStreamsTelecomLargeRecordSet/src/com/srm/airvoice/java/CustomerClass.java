package com.srm.airvoice.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class CustomerClass {
	
	public void addDetails(ArrayList<Customer> al) {
		System.out.println("ArrayList Elements:"+al);
		System.out.println("-----------------------------------------------------------");
}
	
public void limitedRecord(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Fetching 5 records in India!!!");
al.stream().filter(customer -> customer .baseCntry1.equals("India")).limit(4).forEach(System.out::println);
System.out.println("-----------------------------------------------------------");
}

public void searchCntryDes11(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Fetching records in America and Prepaid...");
al.stream().filter(cust->cust.baseCntry1.equals("America") && cust.description.equals("Prepaid")
		&& cust.isActive==true).map(cust->cust).forEach(System.out::println);
System.out.println("-----------------------------------------------------------");
}


public void searchCntryDes2(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Fetching records contains SouthAfrica , China and prepaid.");
al.stream().filter(customer -> customer.baseCntry1.equals("SouthAfrica")||customer.baseCntry1.equals("Japan")&& customer.description.equals("Prepaid")
		&& customer.isActive==true).map(customer -> customer).forEach(System.out::println);
System.out.println("-----------------------------------------------------------");
}

public void fectchingDetails(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Fetching records of numbers starting with 78!");
al.stream().filter((customer) -> customer.pno.startsWith("78")).forEach(System.out::println);
System.out.println("-----------------------------------------------------------");
}

public void fectchingDetails11(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Fetching records of numbers starting with 78,base country is India and 4g is true.");
al.stream().filter((customer) -> customer.pno.startsWith("78")&& customer.baseCntry1.equals("India")
		&&customer.is4g==true).forEach(System.out::println);	
System.out.println("-----------------------------------------------------------");
}

public void sortDetails(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Sorted based on customer name and phone number..");
System.out.println("-----------------------------------------------------------");
Comparator<Customer> compareByName = Comparator
        .comparing(Customer::getCname)
        .thenComparing(Customer::getPno);
List<CustomerClass> list=al.stream().sorted(compareByName).collect(Collectors.toList());
list.forEach(System.out::println);
}

public void printRecords(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Fetching records in one line.");
al.stream().map(customer->customer).forEach(System.out::println);
System.out.println("-----------------------------------------------------------");
}

public void matchingRecords(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Finding whether the records are matched!!!");
System.out.println("-----------------------------------------------------------");

   Predicate<CustomerClass> p1 = s -> s.getId()==125 && s.getCname().equals("Deepak");
   boolean b1=al.stream().anyMatch(p1);
  if(b1==true)
  {
	  System.out.println("Records matched for  given id and name!!!");
	  }
  else
  {
	  System.out.println("No records found..");
  }
}
private int getId() {
	return 0;
}
private Object getCname() {
	return null;
}

public void sortDetails1(ArrayList<Customer> al) {
System.out.println("");
System.out.println("Sorted based on customer name and phone number.");
System.out.println("Names changed to uppercase!!");
	String names = al.stream() .map(customer -> customer.cname.toUpperCase()) .collect(Collectors.joining(","));
	 System.out.println(names);
	 System.out.println("-----------------------------------------------------------");
	 
	 Comparator<Customer> compareByName = Comparator
                .comparing(Customer::getCname)
                .thenComparing(Customer::getPno);
	 al.stream().filter((customer) -> customer.pno.startsWith("99")&& customer.baseCntry1.equals("Norway"))
	 .sorted(compareByName).collect(Collectors.toList()).forEach(System.out::println);	
	}
public void searchCntryDes(ArrayList<Customer> al) {	
}
public void searchCntryDes1(ArrayList<Customer> al) {
}
public void fectchingDetails1(ArrayList<Customer> al) {
}
}



		

	


