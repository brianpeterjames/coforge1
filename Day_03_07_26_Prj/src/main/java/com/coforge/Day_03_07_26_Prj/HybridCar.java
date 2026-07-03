package com.coforge.Day_03_07_26_Prj;

public class HybridCar implements PetrolCar,ElectricCar{
	@Override 
	public void provideAC() {
		PetrolCar.super.provideAC();
		ElectricCar.super.provideAC();
		System.out.println("Hybrid Car can provide AC in both modes");
	}

}
