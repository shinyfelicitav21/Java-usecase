package com.srm.lab01.java;
import java.util.LinkedList;
public class MiddleElement {
static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node n = head;
        while(n != null){
            System.out.print("-> "+n.data);
            n = n.next;
        }
        System.out.println("");
    }
    public void printMiddle(){Node fast = head;
    Node slow = head;
    while(fast!=null && fast.next !=null){
        slow = slow.next;
        fast = fast.next.next;
    }
    System.out.println("Middle element:"+slow.data);
    }
    public static void main(String[] args) {
    	System.out.println("FINDING MIDDLE ELEMENT OF LINKEDLIST IN ONE PASS.");
		System.out.println("-------------------------------------------------");
        LinkedList llist = new LinkedList(); 
            for (int i=5; i>0; --i){ 
                llist.push(i); 
                System.out.println(i);
                System.out.println(llist);
               
				printMiddle(llist);
            } 
    }
	private static void printMiddle(LinkedList llist) {
	}
	}

