package com.nps.practiceproject.service;

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

}
