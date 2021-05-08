package com.srm.report.java;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class ReportGeneration {
	String cid,category;
	Date datetime=new Date();
	int id;
	String description;
	int qnty;
	float costpitem;
	double total;
	
	public ReportGeneration(String cid, Date datetime, int id,String category, String description, int qnty,
			float costpitem, double total) {
		super();
		this.cid = cid;
		this.category = category;
		this.datetime = datetime;
		this.id = id;
		this.description = description;
		this.qnty = qnty;
		this.costpitem = costpitem;
		this.total = total;
	}
	@Override
	public String toString() {
		return "ReportGeneration :[CID=" + cid + ", Date=" + datetime + ", ID=" + id + ",Category=" + category + ", Description=" + description
				+ ", Quantity=" + qnty + ", Cost.per.item=" + costpitem + ", Total=" + total + ",]";
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQnty() {
		return qnty;
	}
	public void setQnty(int qnty) {
		this.qnty = qnty;
	}
	public float getCostpitem() {
		return costpitem;
	}
	public void setCostpitem(float costpitem) {
		this.costpitem = costpitem;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public static void main(String[] args) {
		System.out.println("SALES REPORT GENERATION.");
		System.out.println("------------------------");
		String cid = "";
		Date datetime = new Date();
		int id = 0;
		String category="";
		String description = " ";
		int qnty = 0;
		float costpitem = 0;
		double total = 0.0;
		double gtotal = 0;
		ArrayList<ReportGeneration> al = new ArrayList<ReportGeneration>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer.id:");
		cid = sc.nextLine();
		System.out.println("Enter the no.of.items:");
		int n = sc.nextInt();
		double gst = 0.0;
		System.out.println("Enter the GST amount:");
		gst = sc.nextDouble();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the id.no:");
			id = sc.nextInt();
			System.out.println("Enter the category:");
			category=sc.next();
			System.out.println("Enter the description:");
			description = sc.next();
			System.out.println("Enter the no.of.quantity:");
			qnty = sc.nextInt();
			System.out.println("Enter the cost.per.item:");
			costpitem = sc.nextInt();
			total = qnty * costpitem;
			System.out.println("Total amount:" + total);
			System.out.println("------------------------");
		}
		 gst=gst/100;
         //System.out.println(gst);
		   double calgst=gst*total;
		//   System.out.println(calgst);
		 gtotal=total+calgst+calgst;
		al.add(new ReportGeneration(cid, datetime, id,category, description, qnty, costpitem, total));
		System.out.println("\t\t\t\t\tE-Mart.");
		System.out.println("\t\t\t\t123 Avenue CA District. ");
		System.out.println(
				"-------------------------------------------------------------------------------------------");
		System.out.println("Customer ID:" + cid);
		System.out.println("DateTime : " + datetime);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println("ID\tDescription\tQuantity\t Cost.Per.Item\tTotal");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(id + "\t " + description + "\t\t" + qnty + "\t\t" + costpitem + "\t\t" + total);
		}
		System.out.println("\t\t\t\t\t---------------------------------------");
		System.out.println("\t\t\t\t         Total: \t" +     total);
		System.out.println("\t\t\t\t\t S GST(%6): \t" + calgst);
		System.out.println("\t\t\t\t\t C GST(%6): \t" + total);
		System.out.println("\t\t\t\t\t---------------------------------------");
		
		System.out.println("\t\t\t\t\t Grand Total: \t" + gtotal);
		System.out.println("\t\t\t\t\t---------------------------------------");
	}
}


