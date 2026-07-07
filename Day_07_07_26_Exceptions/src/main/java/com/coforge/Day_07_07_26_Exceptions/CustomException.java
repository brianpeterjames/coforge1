package com.coforge.Day_07_07_26_Exceptions;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Brian",22,"Dehradun");
		if(p.getAge()<18)
		{
			throw new AgeNotSufficientException("Person Age is less than 18");
		}
		else 
		{
			System.out.println("Person is eligible to cast Vote");
		}

	}

}
