package com.coforge.Day_07_07_26_Exceptions;


public class App {
    public static void main(String[] args) {

    	String text = null;
    	try {
    	int len = text.length(); 
    	}
    	catch(NullPointerException ne)
    	{
    		System.out.println("Length is null");
    		ne.printStackTrace();
    	}
//        
        //System.out.println("Length is: " + len);
    	int a = 78, b[]= {2,3,4,5,6},c=0;
    	try {
    	for(int i=0;i<b.length;i++)
    	{
    		c = a/b[i];
    	}
    	}
    	catch(ArithmeticException e) {
    		e.printStackTrace();
    	}
    	catch(ArrayIndexOutOfBoundsException ae)
    	{
    		ae.printStackTrace();
    	}
    	catch(RuntimeException r)
    	{
    		r.printStackTrace();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally {
    		System.out.println("After try catch");
    	}
    	System.out.println(c);
    	// Assignment - Student Class  
    	// generate student marks report  
    	// handle arithmetic exception  -- Average  
    	// Null Pointer Exception -- multiple student reports
    	// Array Index out of bounds -""
    	// StringIndexOutOfBounds 
    	
    	
    }
}
