package com.srm.lab02.java;
public class MathNumToWord {
	private static final String[] specialNames = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	    };
	    private static final String[] tensNames = {
	        "",
	        " ten",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	    };
	    private static final String[] numNames = {
	        "",
	        " One",
	        " two",
	        " three",
	        " four",
	        " five",
	        " six",
	        " seven",
	        " eight",
	        " nine",
	        " ten",
	    };
	    private String convertLessThanOneThousand(int number) {
	        String current;
	        if (number % 100 < 20){
	            current = numNames[number % 100];
	            number /= 100;
	        }
	        else {
	            current = numNames[number % 10];
	            number /= 10;
	            current = tensNames[number % 10] + current;
	            number /= 10;
	        }
	        if (number == 0) return current;
	        return numNames[number] + " hundred and" + current;
	    }
	    public String convert(int number) {
	        if (number == 0) { return "Zero"; }
	        String prefix = "";
	        if (number < 0) {
	            number = -number;
	            prefix = "Negative";
	        }
	        String current = "";
	        int place = 0;
	        do {
	            int n = number % 1000;
	            if (n != 0){
	                String str = convertLessThanOneThousand(n);
	                current = str + specialNames[place] + current;
	            }
	            place++;
	            number /= 1000;
	        } while (number > 0);
	        return (prefix + current).trim();
	    }
	    public static void main(String[] args) {
	    	System.out.println("CONVERTING MATH NUMBER TO EQUIVALENT READABLE WORD.");
			System.out.println("--------------------------------------------------");
	    	MathNumToWord ob = new MathNumToWord();
	        System.out.println("*** " + ob.convert(1234));
	        System.out.println("*** " + ob.convert(-55));
	}
}
