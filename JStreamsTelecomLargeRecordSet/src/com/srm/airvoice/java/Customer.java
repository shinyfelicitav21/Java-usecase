package com.srm.airvoice.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Customer extends CustomerClass{
	
	int id;
	String cname;
	String address;
	String baseCntry1;
	String pno;
	boolean is4g;
	int bamt;
	int pid;
	 String description;
	 int vasid;
	 String vas;
	 boolean isActive;
	 
	public Customer(int id, String cname, String address, String baseCntry1, String pno, boolean is4g,
			int bamt, int pid, String description, int vasid, String vas, boolean isActive) {
		super();
		this.id = id;
		this.cname = cname;
		this.address = address;
		this.baseCntry1 = baseCntry1;
		this.pno = pno;
		this.is4g = is4g;
		this.bamt = bamt;
		this.pid = pid;
		this.description = description;
		this.vasid = vasid;
		this.vas = vas;
		this.isActive = isActive;
	}
	
	public static void main(String args[]) {
	System.out.println("AIRVOICE MEMORY PROCESSING.");
	System.out.println("---------------------------");
		 Customer c1=new Customer(122,"Raj","Avadi","India","7890567831",true,344,990,"Prepaid",118,"VAS:Games",true);
		 
		 Customer c2=new Customer(123,"Sharma","Kerala","India","7789345612",true,455,789,"Postpaid",0,"VAS:Disabled",false);
		 
		 Customer c3=new Customer(125,"Deepak","Tharamani","India","9878564321",true,222,789,"Prepaid",456,"VAS:Callertune",true);
		 
		 Customer c4=new Customer(100,"Shilpa","Choolai","India","8879223490",false,344,544,"Postpaid",0,"VAS:Disabled",false);
		 
		 Customer c5=new Customer(145,"Bharath","Chrompet","India","7790334578",true,678,342,"Postpaid",0,"VAS:Disabled",false);
		 
		 Customer c6=new Customer(112,"Nancy","Norway","Nigeria","6609334870",true,333,555,"Prepaid",678,"VAS:Sports",true);
		 
	 Customer c7=new Customer(120,"Naveen","Africa","SouthAfrica","9987123409",true,456,889,"Prepaid",789,"VAS:Games",true);
	 
	 Customer c8=new Customer(143,"Lakshmi","Africa","SouthAfrica","8879021345",true,445,234,"Prepaid",234,"VAS:Callertune",true);
	 
	 Customer c9=new Customer(121,"Hari","Florida","America","9023480618",true,344,678,"Prepaid",333,"VAS:Sports",true);
	 
	 Customer c10=new Customer(144,"Xavier","Singapore","Japan","9908761123",true,344,789,"Prepaid",345,"VAS:Callertune",true);
	 
	 Customer c11=new Customer(101,"Manjula","US","America","9989073421",true,789,333,"Postpaid",0,"VAS:Disabled",false);
	 
	 Customer c12=new Customer(167,"Meera","Korea","Korea","7789034432",true,345,545,"Postpaid",0,"VAS:Disabled",false);
	 
		 ArrayList<Customer> al=new ArrayList<Customer>();
		 al.add(c1);
		 al.add(c2);
		 al.add(c3);
		 al.add(c4);
		 al.add(c5);
		 al.add(c6);
		 al.add(c7);
		 al.add(c8);
		 al.add(c9);
		 al.add(c10);
		 al.add(c11);
		 al.add(c12);
		 
			 System.out.println(al);
			 Scanner sc=new Scanner(System.in);
			 CustomerClass cc=new CustomerClass();
			 System.out.println("");
			 System.out.println("Enter the no.of.times for looping:");
	            int n1=sc.nextInt();
	            for(int j=0;j<n1;j++)
	            {
			 System.out.println("Enter the number to invoke the method:");
	            int n= sc.nextInt();
	           
	            switch (n) {
	                case 1:
	                	 cc.limitedRecord(al);
	                    break;
	                case 2:
	                	 cc.addDetails(al);
	                    break;
	                case 3:
	                	cc.searchCntryDes11(al);
	                    break;
	                case 4:
	                	cc.searchCntryDes2(al);
	                    break;
	                case 5:
	                	cc.fectchingDetails(al);
	                    break;
	                case 6:
	                	cc.fectchingDetails11(al);
	                    break;
	                case 7:
	                	cc.sortDetails1(al);
	                    break;
	                case 8:
	                	cc.matchingRecords(al);
	                    break;
	                case 9:
	                	cc.printRecords(al);
	                    break;
	                case 10:
	                	cc.sortDetails(al);
	                    System.exit(0);
	                default:
	                    System.out.println("Please enter the valid number to perform the operation!!");
	            }}
	}
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getbaseCntry1() {
		return baseCntry1;
	}
	public void setBaseCtry1(String baseCntry1) {
		this.baseCntry1 = baseCntry1;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public boolean isIs4g() {
		return is4g;
	}
	public void setIs4g(boolean is4g) {
		this.is4g = is4g;
	}
	public int getBamt() {
		return bamt;
	}
	public void setBamt(int bamt) {
		this.bamt = bamt;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getVasid() {
		return vasid;
	}
	public void setVasid(int vasid) {
		this.vasid = vasid;
	}
	public String getVas() {
		return vas;
	}
	public void setVas(String vas) {
		this.vas = vas;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
@Override
public String toString() {
	return "Customer: [ID=" + id + ", Cname=" + cname + ", Address=" + address + ", Base Country=" + baseCntry1
			+ ", Phone.No=" + pno + ", VasId=" +  vasid + ", Vas=" + vas + ", IsActive=" + isActive + "]";
}
}


	
