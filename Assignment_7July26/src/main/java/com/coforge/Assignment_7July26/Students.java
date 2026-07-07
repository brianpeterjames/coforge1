package com.coforge.Assignment_7July26;

public class Students {
    private String name;
    private int marks;
    public Students(String name) {
        this.name = name;
    }
    public int getMarks() {
        return this.marks;
    }
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            // Throwing custom  exception
            throw new InvalidMarksException("Invalid marks ,  marks must be between 0 and 100.");
        }
        this.marks = marks;
        System.out.println("Marks successfully set to " + marks + " for student " + name);
    }
    public String getName() {
        return this.name;
    }
}