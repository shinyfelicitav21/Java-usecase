package com.srm.generics.java;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class FruitGenerics implements Comparable <FruitGenerics> {
		String fname,ftype,fcolor,fdname,expdate,location;
		int fcost,fqnty;
		double fweight;
		     public int getFcost() {
			return fcost;
		}
		public void setFcost(int fcost) {
			this.fcost = fcost;
		}
			public FruitGenerics(String fname, String ftype, String fcolor, String fdname,String expdate, int fcost, int fqnty,
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
	public static void main(String[] args) {
		System.out.println("ABC FRUIT SHOP VERSION-2.");
		System.out.println("-------------------------");
		Scanner sc=new Scanner(System.in);
		String fname="", ftype="",fcolor="",fdname="",expdate="",location="";
		int fcost=0,fqnty=0;
		double fweight=0.0;
		int n=2;
		Map<Integer,List<FruitGenerics>> hash=new HashMap<Integer,List<FruitGenerics>>();
        //Map<Integer,String> map=new HashMap<Integer,String>();
       List<FruitGenerics> l=new ArrayList<FruitGenerics>();
		ArrayList al=new ArrayList();
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
	        System.out.println("Enter expiry date:");
	         expdate=sc.next();
	          System.out.println("Enter distributor name:");
	          fdname=sc.next();
	          System.out.println("Enter the location:");
	          location=sc.next();
	          System.out.println("---------------------------");
	        al.add(new FruitGenerics(fname,ftype,fcolor,fdname,expdate,fcost,fqnty,fweight,location));
	        hash.put(0,al);
	       // System.out.println(al);
	       // System.out.println(hash);
	}
	  MethodFruit fruit=new   MethodFruit();
	   fruit.addData(hash);
	   fruit.sortElements(al);
	    //for(int i=0;i<hash.size();i++)
	   // {
	   // System.out.println(hash.get(i));
	    //}
	     } 
		@Override
	     public String toString() {
	     return "Fruit: [Fname=" + fname + ", Ftype=" + ftype + ", Fcolor=" + fcolor
	     + ", Fcost=" + fcost + ", Fweight=" + fweight + ", Exp.Date=" + expdate + ", FDname=" + fdname + ",Location=" + location + "]";
	     }
		public boolean equals(FruitGenerics obj)
	    {
	   	 if(obj==null)
	   		 return false;
	   	 if(obj==this)
	   		 return true;
	   	 if(obj.getClass()!=getClass())
	   		 return false;
	   	 
	   	 FruitGenerics fc = (FruitGenerics) obj;
	        if(fc.getFname().equals(getFname())&&fc.getFcolor().equals(getFcolor()))
	   	 return true;
	   	 
			return false;
	    }
	    public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getFcolor() {
			return fcolor;
		}
		public void setFcolor(String fcolor) {
			this.fcolor = fcolor;
		}
		public int compareTo(FruitGenerics o) {
	   	    return getFname().compareTo(o.getFname());
	}
}
