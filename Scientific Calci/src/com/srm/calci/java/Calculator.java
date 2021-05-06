package com.srm.calci.java;
import java.util.Scanner;
public class Calculator {
	int a,b,c;
	float x,y,z;
	double d,d1,d2,d3;
	Scanner sc=new Scanner(System.in);
	public void Sum()
	{
		System.out.println("SUM OF NUMBERS.");
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum:"+c);
		System.out.println("----------------------");
	}
	public void Divide()
	{
		System.out.println("DIVIDE.");
		System.out.println("Enter the numbers:");
		x=sc.nextInt();
		y=sc.nextInt();
		z=x/y;
		System.out.println("Divided value:"+z);
		System.out.println("----------------------");
	}
	public void CubeRoot() 
	{
		System.out.println("FINDING CUBE ROOT.");
		System.out.println("Enter the number:");
		d1=sc.nextInt();
		double cbr=Math.cbrt(d1);
		System.out.println("Cube root of  "+d1+" : "+cbr);
		System.out.println("----------------------");
	}
	public void SquareRoot() 
	{
		System.out.println("SQUARE ROOT OF A NUMBER.");
		System.out.println("Enter the number:");
		d=sc.nextInt();
		double sqr=Math.sqrt(d);
		System.out.println("Square root of  "+d+" : "+sqr);
		System.out.println("----------------------");
	}
	public void Cos() 
	{
		System.out.println("COS OF A NUMBER.");
		System.out.println("Enter the number:");
		d2=sc.nextInt();
		d2=Math.toRadians(d2);
		System.out.println("Cos value of "+d2+" :" +Math.cos(d2));
		System.out.println("----------------------");
	}
	public void Tan() 
	{
		System.out.println("TAN VALUE.");
		System.out.println("Enter the number:");
		d3=sc.nextInt();
		d3=Math.toRadians(d3);
		System.out.println("Tan value of "+d2+" :" +Math.cos(d2));
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		System.out.println("SCIENTIFIC CALCULATOR.");
		System.out.println("----------------------");
		Calculator calci=new Calculator();
		calci.Sum();
		calci.Divide();
		calci.CubeRoot();
		calci.SquareRoot();
		calci.Cos();
		calci.Tan();
	}
}
