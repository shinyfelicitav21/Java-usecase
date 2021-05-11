package com.srm.file.java;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public  abstract class BaseManager {

	protected List<TextFile> getFiles(String location){
		File[] files=new File(location).listFiles();
	List <TextFile> txtFiles= new ArrayList<>();
	int count=0;
	for(File file:files) {
		txtFiles.add(new TextFile(++count,file.getName(),location,new java.util.Date()));
	}
	return txtFiles;
	}
	
		

	}

