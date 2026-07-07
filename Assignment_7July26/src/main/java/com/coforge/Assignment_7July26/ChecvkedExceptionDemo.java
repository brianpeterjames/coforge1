package com.coforge.Assignment_7July26;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ChecvkedExceptionDemo {

	
		public static void main(String[] args) {
	        try {
	            System.out.print("Attempting to load class dynamically: ");
	            Class.forName("com.xyz.package.Cocojpeter");
	        } catch (ClassNotFoundException e) {
	            System.out.println("Caught ClassNotFoundException , couldn't find the class ");
	        }
	   
	        try {
	            System.out.print("Attempting to read a file: ");
	            FileReader reader = new FileReader("brian.txt");
	            reader.read(); 
	            reader.close();
	        } catch (IOException e) {
	            System.out.println("Caught IOException, Could not read or locate the file ");
	        }

	        try {
	            System.out.print("Putting thread to sleep: ");
	            Thread.currentThread().interrupt();    
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            System.out.println("Caught InterruptedException, the thread's sleep was broken!");
	        }
	        
	        try {
	            System.out.print("Parsing a text string into a Date: ");
	            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	            Date currentDate = formatter.parse("July 2026"); 
	            System.out.println(currentDate);
	        } catch (ParseException e) {
	            System.out.println("Caught ParseException,the text structure did not match ");
	        }

	    }
		
		

	

}
