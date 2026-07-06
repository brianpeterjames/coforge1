package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.Comparator;

public class DepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return o1.getDept().compareTo(o2.getDept());
	}

}
