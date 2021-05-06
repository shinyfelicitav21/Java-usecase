package com.srm.lab02.java;
public class ThreadID {
	public static void main(String[] args) {
		System.out.println("GETTING THREAD ID.");
		System.out.println("------------------");
		Thread t1 = new Thread(new NumberRunnable());
	    Thread t2 = new Thread(new NumberRunnable());
	    Thread t3 = new Thread(new NumberRunnable());
	    t1.setName("Thread-1");
	    t2.setName("Thread-2");
	    t2.setName("Thread-3");
	    t1.start();
	    t2.start();
	    t3.start();
	  }
	}
	class NumberRunnable implements Runnable{
	  @Override
	  public void run() {   
	    System.out.println("Thread ID: " + Thread.currentThread().getId() + " for " + Thread.currentThread().getName());                       
	  }
	}


