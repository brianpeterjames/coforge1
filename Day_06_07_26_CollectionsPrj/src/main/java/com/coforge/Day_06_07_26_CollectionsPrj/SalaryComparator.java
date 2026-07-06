package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o2.getSalary()-o1.getSalary());
	}
	
	
}
