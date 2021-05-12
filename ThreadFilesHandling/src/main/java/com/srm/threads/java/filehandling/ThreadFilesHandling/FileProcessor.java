package com.srm.threads.java.filehandling.ThreadFilesHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class FileProcessor {
private static FileProcessor fileProcessor = null;
private TreeMap<LineData, Integer> tMap = new TreeMap<LineData, Integer>(new SortLineDataByName());

private FileProcessor() {
	
}
public static FileProcessor getInstance() {
	if(fileProcessor == null) {
		fileProcessor = new FileProcessor();
	}
	return  fileProcessor;
}

public void processPayLoad(List<TextFile> listFile) {

	for(TextFile f: listFile) {
		
		try {
			doTheWork(f);
		} catch (FileNoFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

private void doTheWork(TextFile tf) throws FileNoFoundException {
	
	File file=new File(tf.getLocation().concat(tf.getFilename()));
	
	BufferedReader br = null ;
	try {
	br = new BufferedReader(new FileReader(file));
	String line;
	String[] contents;
	
	while((line = br.readLine()) != null) {
		System.out.println(line);
		contents = line.split(",");
		
		if(!contents[0].equalsIgnoreCase("id")){
			
		LineData ldata = new LineData(Integer.parseInt(contents[0]),contents[1],contents[2],Integer.parseInt(contents[3]));
		synchronized(this){
			tMap.put(ldata, ldata.getId());
		}
		}
	}
	
}catch(FileNotFoundException fe)
 	{
	
		System.out.println("An Error Occured!!");
		fe.printStackTrace();
	}
	
	catch(IOException e1)
	{
	  e1.printStackTrace();
	}
	
	finally {
		
	try {
	br.close();
} 
	catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}

private void Synchronized(FileProcessor fileProcessor2) {
	// TODO Auto-generated method stub
	
}
private String getFilename() {
	// TODO Auto-generated method stub
	return null;
}
public TreeMap<LineData, Integer> getFinalResults(){
	return tMap;
}

}
