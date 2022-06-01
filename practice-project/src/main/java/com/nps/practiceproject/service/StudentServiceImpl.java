package com.nps.practiceproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nps.practiceproject.model.Student;
import com.nps.practiceproject.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository studentRepository;
	
	public Student save(Student student) {
		return studentRepository.save(student);	
	}

	public Student fetchStudentById(int id) {
		Optional<Student> student = studentRepository.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		}
		
		return null;
	}
}
