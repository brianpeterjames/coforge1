package com.coforge.Day_03_07_26_Prj;

public class Skoda implements Car{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started remotely");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Car Stopped remotely");
	}
	@Override
	public void provideAC() {
		System.out.println("AC provided");
	}

}
