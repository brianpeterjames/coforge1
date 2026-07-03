package com.coforge.Day_03_07_26_Prj;

public interface ElectricCar {
public default void provideAC()
{
	System.out.println("Electric Car provides smart AC");
}
}
