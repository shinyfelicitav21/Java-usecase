package com.srm.file.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileProcessor {
private static FileProcessor fileProcessor = null;

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
			doTheWWork(f);
		} catch (FileNoFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
private void doTheWWork(TextFile tf) throws FileNoFoundException {
	File file = new File(tf.getLocation().concat(getFilename()));
	BufferedReader br = null ;
	try {
	br = new BufferedReader(new FileReader(file));
	String line;
	
	while((line = br.readLine()) != null) {
		System.out.println(line);
	}
	
}catch(IOException ioe) {
}finally {
	try {
	br.close();;
	}catch(IOException e) {
		e.printStackTrace();
	}
	
}
	
}
private String getFilename() {
	// TODO Auto-generated method stub
	return null;
}
}
