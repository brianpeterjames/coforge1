package com.coforge.Day_06_07_26_CollectionsPrj;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedList;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employeeList = new LinkedList<Employee>();

		employeeList.add(new Employee("Aarav Sharma", 101, "Delhi", "IT", 75000.00));
		employeeList.add(new Employee("Aditi Rao", 102, "Mumbai", "HR", 60000.00));
		employeeList.add(new Employee("Rohan Verma", 103, "Bengaluru", "Finance", 90000.00));
		employeeList.add(new Employee("Diya Iyer", 104, "Chennai", "Marketing", 65000.00));
		employeeList.add(new Employee("Amit Patel", 105, "Ahmedabad", "IT", 82000.00));
		employeeList.add(new Employee("Vikram Singh", 106, "Dehradun", "Operations", 55000.00));
		employeeList.add(new Employee("Neha Gupta", 107, "Pune", "HR", 62000.00));
		employeeList.add(new Employee("Sanjay Nair", 108, "Kochi", "Finance", 88000.00));
		employeeList.add(new Employee("Ananya Das", 109, "Kolkata", "Marketing", 67000.00));
		employeeList.add(new Employee("Rahul Joshi", 110, "Dehradun", "IT", 78000.00));
		employeeList.add(new Employee("Pooja Reddy", 111, "Hyderabad", "Operations", 58000.00));
		employeeList.add(new Employee("Manish Choudhury", 112, "Jaipur", "Finance", 85000.00));
		employeeList.add(new Employee("Kriti Malhotra", 113, "Gurugram", "HR", 70000.00));
		employeeList.add(new Employee("Arjun Mehta", 114, "Mumbai", "IT", 95000.00));
		employeeList.add(new Employee("Sneha Kulkarni", 115, "Pune", "Marketing", 64000.00));
		employeeList.add(new Employee("Abhishek Mishra", 116, "Noida", "Operations", 57000.00));
		employeeList.add(new Employee("Tanvi Bhat", 117, "Bengaluru", "IT", 105000.00));
		employeeList.add(new Employee("Deepak Kumar", 118, "Patna", "Finance", 72000.00));
		employeeList.add(new Employee("Riya Sen", 119, "Guwahati", "HR", 59000.00));
		employeeList.add(new Employee("Varun Dhawan", 120, "Chandigarh", "Marketing", 68000.00));
		
		for(Employee emp:employeeList)
		{
			System.out.println(emp);
		}
//		Collections.sort(employeeList);
//		System.out.println("After Sorting.....");
//		for(Employee emp:employeeList)
//		{
//			System.out.println(emp);
//		}
		employeeList.sort(new CityComparator().thenComparing(new DepartmentComparator().thenComparing(new SalaryComparator())));
		Set<Employee> employeeSet = new LinkedHashSet<Employee>(employeeList);
		System.out.println("After Converting");
		for (Employee emp : employeeSet) {
			System.out.println(emp);
		}
		System.out.println("***************");
		// we cant directly apply sort method 
		List<Employee> employeeArrayList = new ArrayList<>(employeeSet);
		Collections.sort(employeeArrayList);
		for(Employee e:employeeArrayList)
		{
			System.out.println(e);
		}
		// complete all operations of HashSet and LinkedHashSet
		
	}

}
