package com.coforge.Day_03_07_26_Prj;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car= new Skoda();
		car.stop();
		car.stop();
		car.provideAC();
		Car.musicSystem();
		
		car = new Honda();
		car.start();
		car.stop();
		car.provideAC();
		Car.musicSystem();
		
	}

}
