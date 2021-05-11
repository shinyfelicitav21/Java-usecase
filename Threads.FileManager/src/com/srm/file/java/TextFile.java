package com.srm.file.java;

import java.util.Date;

public class TextFile {

	 int id;
	 String filename;
	 String location;
	 Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "TextFile [id=" + id + ", filename=" + filename + ", location=" + location + ", date=" + date + "]";
	}
	public TextFile(int id, String filename, String location,Date date) {
		super();
		this.id = id;
		this.filename = filename;
		this.location = location;
		this.date=date;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	}
	

