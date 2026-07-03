package com.coforge.Day_03_07_26_Prj;

public interface Car {
	public void start();
	public void stop();
	public default void provideAC() {
		System.out.println("AC can be enabled by need");
	}
	public static void musicSystem() {
		System.out.println("Music System with 6 speakers");
	}
		
}
