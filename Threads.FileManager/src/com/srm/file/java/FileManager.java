package com.srm.file.java;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
public  class FileManager extends BaseManager {
 public final String FILE_FOLDER = "C:\\Users\\Admin\\Documents\\Java\\Files\\";
 		public final int FILE_PER_THREAD = 2;
 public void doRun() throws InterruptedException {
	 List<TextFile> listFiles= this.getFiles(FILE_FOLDER);
	 listFiles.forEach(System.out::println);
	 List<List<TextFile>> listPages = this.getPages(listFiles, FILE_PER_THREAD);
	 listPages.forEach(System.out::println);
	 for(int i=0;i<listPages.size();i++) {
		 FileThread fThread = new FileThread(listPages.get(i));
		 Thread thread = new Thread(fThread);
		 thread.setName("File Reader-" +i);
		 thread.start();
		 thread.join();
	 }
	 System.out.println("-----------Done------------");
 }
 
 
	 public static void main(String []args) {
		 try {
			new FileManager().doRun();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}

