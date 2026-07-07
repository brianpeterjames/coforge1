package com.coforge.Day_07_07_26_Exceptions;

public class CalculatorApp {

	public static void main(String[] args) {
//		CalculatorInterface ci =()->{
//			int a = 10,b=5;
//			System.out.println(a/b);
//			};
			
			CalculatorInterface ci1 =(a,b)->{
				System.out.println(a*b);
			}; // when only one return is there 
				
			
			
//		System.out.println(a/b);}
//		System.out.println(ci1.add(5, 6));
//		System.out.println(ci1.sub());
		ci1.mul(2, 5);
		//ci.div();
	}


//	@Override
//	public int sub() {
//		int a = 67,b=34;
//		return a-b;
//	}

//	@Override
//	public void mul(int a, int b) {
//		
//		System.out.println(a*b);
//	}
//
//	@Override
//	public void div() {
//		int a = 10,b=5;
//		System.out.println(a/b);
//	}

}
