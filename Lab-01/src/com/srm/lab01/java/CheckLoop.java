package com.srm.lab01.java;
import java.util.LinkedList;
public class CheckLoop {
	Node head;
	  static class Node {
	    int value;
	    Node next;
	    Node(int d) {
	      value = d;
	      next = null;
	    }
		public boolean checkLoop() {
			return false;
		}
	  }
	  public boolean checkLoop() {
	    Node first = head;
	    Node second = head;
	    while(first != null && first.next !=null) {
	      first = first.next.next;
	      second = second.next;
	      if(first == second) {
	        return true;
	      }
	    }
	    return false;
	  }
	  public static void main(String[] args) {
		  System.out.println("CHECKING LOOP IN LINKEDLIST.");
		System.out.println("------------------------------");
	    LinkedList list = new LinkedList();
	    Node first = new Node(33);
	    Node second = new Node(22);
	    Node third = new Node(33);
	    Node fourth = new Node(44);
	    first.next = second;
	    second.next = third;
	    third.next = fourth;
	    fourth.next = second;
	    System.out.print("LinkedList values : ");
	    int i = 1;
	    while (i <= 4) {
	      System.out.print(first.value + " ");
	      first = first.next;
	      i++;
	    }
	    boolean loop = first.checkLoop();
	    if(loop) {
	      System.out.println("\nThere is a loop in LinkedList!");
	    }
	    else {
	      System.out.println("\nThere is no loop in LinkedList.");
	    }
	    }
    }
    
	

