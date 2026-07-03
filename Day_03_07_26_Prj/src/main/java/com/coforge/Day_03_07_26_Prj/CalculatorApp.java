package com.coforge.Day_03_07_26_Prj;

public class CalculatorApp implements SimpleCalculator,ScientificCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorApp ca = new CalculatorApp();
		ca.add(5, 6);
		// write code to call scientific calculator methods 
		System.out.println(ca.power(2, 6));
		System.out.println(ca.squareRoot(2));

	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}

	@Override
	public double power(double a, double b) {
		// TODO Auto-generated method stub
		return Math.pow(a, b);
		
	}

	@Override
	public double squareRoot(double m) {
		// TODO Auto-generated method stub
		return Math.sqrt(m);
		
	}

	@Override
	public double logValue(double m) {
		// TODO Auto-generated method stub
		return 0;
	}

}
