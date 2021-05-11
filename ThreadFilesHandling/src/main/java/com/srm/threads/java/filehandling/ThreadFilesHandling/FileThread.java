package com.srm.threads.java.filehandling.ThreadFilesHandling;

import java.util.List;

public class FileThread implements Runnable {

	List<TextFile> payload;
	FileThread(List<TextFile> payload){
	this.payload=payload;
	
}

@Override
public void run() {
	FileProcessor.getInstance().processPayLoad(payload);
	
}
}
