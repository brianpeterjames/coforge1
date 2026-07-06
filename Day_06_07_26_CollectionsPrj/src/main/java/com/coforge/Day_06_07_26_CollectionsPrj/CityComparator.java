package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Comparator;

public class CityComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		return o1.getCity().compareTo(o2.getCity());
		
	}
	

}
