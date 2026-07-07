package com.coforge.Assignment_7July26;

public class StudentReport {
	public static void main(String[] args) {
        int[] initialMarks = {85, 90, 78};
        Student student = new Student("Brian J Peter", "S101", initialMarks, "9389887714", "brian@gmail.com", "CS");

        
        try {
            System.out.print("Calculating Average Marks: ");
            int totalMarks = student.marks[0] + student.marks[1] + student.marks[2];
            int totalSubjectsCount = 0; 
            int average = totalMarks / totalSubjectsCount; 
            System.out.println(average);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException, Cannot divide marks by zero subjects!");
        }

        try {
            System.out.print("Checking Email Status: ");
            Student nStudent = null;
            System.out.println(nStudent.email.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException, Attempted to access a field on a null Student object");
        }

        try {
            System.out.print("Accessing Subject 4 Marks: ");
            int fourthSubjectMarks = student.marks[3]; // out of Index 
            System.out.println(fourthSubjectMarks);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException -> Requested subject index does not exist!");
        }

        try {
            System.out.print("Extracting Mobile Country Code: ");
            String countryCode = student.mobNo.substring(0, 15); 
            System.out.println(countryCode);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException, Mobile number string length is shorter than entered index");
        }

        try {
            System.out.print("Updating Student Marks: ");
            int newMark = -45;
            if (newMark < 0 || newMark > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            student.marks[0] = newMark;
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException " + e.getMessage());
        }

        try {
            System.out.print("Converting ID to Integer: ");
            int numericId = Integer.parseInt(student.id); // "S101" contains 'S' which is non-numeric
            System.out.println(numericId);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException, Cannot convert alphanumeric Student ID to a clean integer!");
        }

        try {
            System.out.print("Casting Student Object: ");
            Object obj = student; // Upcasting will work fine 
            String castedString = (String) obj; 
            System.out.println(castedString);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException,a Student object cannot be cast to a String instance!");
        }

 
	}
}
