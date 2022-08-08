package com.college.service;

import com.college.dao.StudentDao;
import com.college.model.Student;

public class StudentService {

	public String insert(Student student) {
		StudentDao studao = new StudentDao();
		return studao.insert(student);
	}
	
	public void displayAll(Student student) {
		StudentDao studao = new StudentDao();
		studao.displayAll(student);
	}
}