package com.srm.lab02.java;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadTextFile {
	public static void main(String[] args) {
		System.out.println("READING TEXT FILE.");
		System.out.println("------------------");
		String fileName = "C:\\Users\\Admin\\Documents\\TextFile.txt";
		File file = new File(fileName);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		String line;
		try {
			while((line = br.readLine()) != null){
			    System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
