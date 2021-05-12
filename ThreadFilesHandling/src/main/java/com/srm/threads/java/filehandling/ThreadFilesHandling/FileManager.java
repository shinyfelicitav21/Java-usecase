package com.srm.threads.java.filehandling.ThreadFilesHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public  class FileManager extends BaseManager {
 public final String FILE_FOLDER = "C:\\Users\\Admin\\Documents\\Java\\Files\\";
 		public final int FILE_PER_THREAD = 2;
 		public final String DELIMITER = ",";
 		
 public void doRun() throws InterruptedException, IOException {
	 
	 List<TextFile> listFiles= this.getFiles(FILE_FOLDER);
	 listFiles.forEach(System.out::println);
	 System.out.println("");
	 
	 List<List<TextFile>> listPages = this.getPages(listFiles, FILE_PER_THREAD);
	 listPages.forEach(System.out::println);
	 System.out.println("");
	 
	 for(int i=0;i<listPages.size();i++) {
		 
		 FileThread fThread = new FileThread(listPages.get(i));
		 Thread thread = new Thread(fThread);
		 thread.setName("File Reader-" +i);
		 thread.start();
		 thread.join();
		
	 }
	 
	 System.out.println("");
	 writeFinalResults(FileProcessor.getInstance().getFinalResults());
	 System.out.println("-----------Done!!!------------");
	 
 }
public void writeFinalResults(TreeMap<LineData,Integer> tMap) throws IOException {
	
	BufferedWriter out;
	out = new BufferedWriter(new FileWriter(FILE_FOLDER.concat("OP_"+ System.currentTimeMillis() + ".csv")));
	Set set = tMap.entrySet();
	Iterator it = set.iterator();
	StringBuffer sb =  new StringBuffer();
	
	while(it.hasNext()) {
		
		Map.Entry me = (Entry) it.next();
		LineData ldata = (LineData)me.getKey();
		
		sb.append(ldata.getId());
		sb.append(DELIMITER);
		sb.append(ldata.getName());
		sb.append(DELIMITER);
		sb.append(ldata.getEmail());
		sb.append(DELIMITER);
		sb.append(ldata.getAge());
		sb.append("\n");
		
		out.write(sb.toString() );
		sb.setLength(0);
	}
	
out.close();
}

 public static void main(String args[]) throws InterruptedException
	{
		try {
			
		new FileManager().doRun();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

