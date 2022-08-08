package com.college.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.college.model.Student;
import com.college.service.StudentService;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//4 DIGITS ROLL NO
		int rollno = 0;
		do {
			System.out.print("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			rollno = Integer.parseInt(rollstr);
			if (String.valueOf(rollno).length() != 4) 
				rollno = 0;
			
		} while (rollno == 0);
		
		
		//STUDENT NAME IN UPPERCASE
		String studentName = "";
		
		boolean lowercasefound;
		do {
			System.out.print("Enter the  name: ");
			studentName = sc.nextLine();
			
			lowercasefound = false;
			for (int i = 0; i < studentName.length(); i++) {
				if (Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
			
		} while (studentName.length() > 20 || lowercasefound);
		
		
		//STANDARD IN ROMAN NUMBERS
		String standard = "";
		String[] standards = {"I", "II", "III", "IV", "V", "Vi", "VII", "VIII", "IX", "X"};
		ArrayList<String> list = new ArrayList(Arrays.asList(standards));
		do {
			System.out.print("Enter standard: ");
			standard = sc.nextLine();
		} while (!list.contains(standard));
		
		
		//DATE OF BIRTH IN YYYY-MM-DD FORMAT
		System.out.println("Enter DOB in YYYY-MM-DD format");
		String dob = sc.nextLine();
		 
		 //THE FEES 
		System.out.println("Enter the fees");
		float fee = sc.nextFloat();
		
		Student student = new Student(rollno, studentName, standard, dob, fee );
		StudentService service=new StudentService();
		String res=service.insert(student);
		System.out.println(res);
		
		System.out.println("\n\n for displaying all the entries in a table");
		service.displayAll(student);
	}
}