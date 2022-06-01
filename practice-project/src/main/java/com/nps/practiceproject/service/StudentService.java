package com.nps.practiceproject.service;

import com.nps.practiceproject.model.Student;

public interface StudentService {
	
	Student save(Student student);
	Student fetchStudentById(int id);
}
