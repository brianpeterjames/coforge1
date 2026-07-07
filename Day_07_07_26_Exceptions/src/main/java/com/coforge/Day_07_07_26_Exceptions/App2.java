package com.coforge.Day_07_07_26_Exceptions;

public class App2 {
	public static void div(int a, int b) // propagation of exception 
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else {
			System.out.println(a/b);
		}
	}
	public static void main(String[]args)
	{
		System.out.println("Hello World");
		try {
		div(5,0);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Program Completed");
	}
}
