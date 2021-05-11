package com.srm.threads.java.filehandling.ThreadFilesHandling;
import java.util.Comparator;
public class SortLineDataByName implements Comparator<LineData> {

	@Override
	public int compare(LineData o1, LineData o2) {
		// TODO Auto-generated method stub
		return(o1.getName().compareTo(o2.getName()));
	}

	
}
