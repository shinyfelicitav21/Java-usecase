package com.srm.lab02.java;
public class SignedIntToString {
	public static void main(String[] args) {
	System.out.println("CONVERTING SIGNED INTEGER TO STRING.");
	System.out.println("------------------------------------");
	        String result= intToStr(23);
	        System.out.println("Output is : "+ result);
	    }
	    public static final int MAX_DIGITS = 10;
	    public static String intToStr( int num ){
	        int i = 0;
	        boolean isNegative = false;
	        char[] temp = new char[ MAX_DIGITS + 1 ];
	        if( num < 0 ){
	            num = -num;
	            isNegative = true;
	        }
	        do {
	            temp[i++] = (char)((num % 10) + '0');
	            num /= 10;
	        } while( num != 0 );
	        StringBuilder sb = new StringBuilder();
	        if( isNegative )
	        sb.append( '-' );
	        while( i > 0 ){
	            sb.append( temp[--i] );
	        }
	        return sb.toString();
	}		
	    }


