package com.srm.calci.java;
import java.util.Scanner;
public class Calci {
	public static void main(String[] args) {
		System.out.println("SCIENTIFIC CALCULATOR.");
		System.out.println("----------------------");
		Scanner sc=new Scanner(System.in);
		Sum sum=new Sum();
		Divide div=new Divide();
		SquareRoot sqrt=new SquareRoot();
		CubeRoot cbrt=new CubeRoot();
		Cos cos= new Cos();
		Tan tan=new Tan();
		System.out.println("Enter the number to perform operation:");
        int n= sc.nextInt();
        switch (n) {
            case 1:
            	sum.Sum();
                break;
            case 2:
            	div.divide();
                break;
            case 3:
            	sqrt.SqrtRoot();
                break;
            case 4:
            	cbrt.CbrtRoot();
                break;
            case 5:
            	cos.cos();
                break;
            case 6:
            	tan.tan();
                break;
            default:
                System.out.println("Please enter the valid number!!");
        }
        }
	}
