package com.srm.report.java;
import java.util.ArrayList;
public class TotalCalculation {
	int total=0;
	public int getTotal(ArrayList<ReportGeneration> al) 
	{
		for(int i=0;i<al.size();i++)
		{
			ReportGeneration rg1=al.get(i);
		   total+=rg1.getTotal();
		}
		return total;
	}
}
