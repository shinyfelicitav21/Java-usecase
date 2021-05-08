package com.srm.calci.java;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sum sum=new Sum();
				
		System.out.println("Enter the no.to invoke methods:");
        int n= sc.nextInt();
        switch (n) {
            case 1:
            	sum.Sum();
                break;
            case 2:
            	
                break;
            case 3:
            	cc.searchCntryDes11(al);
                break;
            case 4:
            	cc.searchCntryDes2(al);
                break;
            case 5:
            	cc.fectchingDetails(al);
                break;
            case 6:
            	cc.fectchingDetails11(al);
                break;
            case 7:
            	cc.sortDetails1(al);
            
            default:
                System.out.println("Input no.corresponding operation, please re-enter:");
        }

	}

}
