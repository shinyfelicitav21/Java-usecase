package com.srm.threads.java.filehandling.ThreadFilesHandling;

import java.util.Date;

public class LineData {
private int id;
private String name;
private String email;
private int age;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "LineData [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public LineData(int id, String name, String email, int age) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
}
}
