package com.srm.file.java;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public  class FileManager extends BaseManager {
	
 public final String FILE_FOLDER = "C:\\Users\\Admin\\Documents\\Java\\Files\\SalesJan2009";
 		public final int FILE_PER_THREAD = 2;
 public void doRun() {
	 List<TextFile> lstFiles= this.getFiles(FILE_FOLDER);
	 lstFiles.forEach(System.out::println);
 }

	 public static void main(String []args) {
		 new FileManager().doRun();
}

}

