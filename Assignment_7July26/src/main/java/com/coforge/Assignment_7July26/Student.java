package com.coforge.Assignment_7July26;

import java.util.Arrays;

public class Student {
	String name;
    String id;
    int[] marks; 
    String mobNo;
    String email;
    String branch;
    
    public Student(String name, String id, int[] marks, String mobNo, String email, String branch) 
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.mobNo = mobNo;
        this.email = email;
        this.branch = branch;
    }

	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + Arrays.toString(marks) + ", mobNo=" + mobNo
				+ ", email=" + email + ", branch=" + branch + "]";
	}
	
    
}
