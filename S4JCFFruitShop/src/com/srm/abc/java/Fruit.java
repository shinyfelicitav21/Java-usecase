package com.srm.abc.java;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public class Fruit implements Comparable <Fruit> {
	String fname,ftype,fcolor,fdname,location;
     static Date expdate;
	int fcost,fqnty;
	double fweight;
	     public int getFcost() {
		return fcost;
	     }
	public void setFcost(int fcost) {
		this.fcost = fcost;
	}
		public Fruit(String fname, String ftype, String fcolor, String fdname,Date expdate, int fcost, int fqnty,
			double fweight,String location) {
		super();
		this.fname = fname;
		this.ftype = ftype;
		this.fcolor = fcolor;
		this.fdname = fdname;
		this.expdate = expdate;
		this.fcost = fcost;
		this.fqnty = fqnty;
		this.fweight = fweight;
		this.location=location;
	}
		public static void main(String args[]) { 
			System.out.println("ABC FRUIT SHOP.");
			System.out.println("---------------");
		Scanner sc=new Scanner(System.in);
		String fname="", ftype="",fcolor="",fdname="",location="";
		Date expdate=new Date();
		int fcost=0,fqnty=0;
		double fweight=0.0;
		int n=2;
	    List list=new ArrayList();
	    for(int i=0;i<n;i++) {
	           System.out.println("Enter fruit name:");
	           fname=sc.next();
	          System.out.println("Enter fruit type:");
	           ftype=sc.next();
	          System.out.println("Enter fruit color:");
	           fcolor=sc.next();
	          System.out.println("Enter fruit cost:");
	           fcost=sc.nextInt();
	         System.out.println("Enter fruit weight:");
	         fweight=sc.nextDouble();
	         // System.out.println("Enter expiry date:");
	         //expdate=sc.next();
	          System.out.println("Enter distributor name:");
	          fdname=sc.next();
	          System.out.println("Enter the location:");
	          location=sc.next();
	      list.add(new Fruit(fname,ftype,fcolor,fdname,expdate,fcost,fqnty,fweight,location));  
	    }
	    MethodTest mt=new MethodTest();
	    mt.addData(list);
	    mt.bubbleSortArrayList(list);
	    for(int i=0;i<list.size();i++)
	    {
	    System.out.println(list.get(i));
	    }
		}
	    public String toString() {
	     return "Fruit: [Fname=" + fname + ", Ftype=" + ftype + ", Fcolor=" + fcolor
	     + ", Fcost=" + fcost + ", Fweight=" + fweight + ", Exp.Date=" + expdate + ", FDname=" + fdname + ",Location=" + location + "]";
		}
	     public int compareTo(Fruit fc) {
	 		int res = 0;
	         if (this.fcost < fc.getFcost()) {
	             res =- 1;
	         }
	         if (this.fcost> fc.getFcost()) {
	             res = 1;
	         }
	         return res;
	     }
		
}

