package com.nps.practiceproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nps.practiceproject.model.Student;
import com.nps.practiceproject.service.StudentService;

@RestController
public class MainController {

	@Autowired
	StudentService studentService;
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMain(){
        return "Test Main Complete";
    }

    //saving student details
    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
		return studentService.save(student);
    }
    
    //fetching student data by id
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id) {
    	Student student = studentService.fetchStudentById(id);
    	
    	//set response body
    	if(student == null) {
    		return ResponseEntity.notFound().build();
    	}
    	else {
    		return ResponseEntity.ok().body(student);
    	}
    	
    }

    //deleting student data by id
    @RequestMapping(value = "/student", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteStudent(@RequestParam int id) {
    	String confirm = studentService.deleteStudentById(id);
    	
    	//set response body
    	if(confirm == null) {
    		return ResponseEntity.notFound().build();
    	}
    	else {
    		return ResponseEntity.ok().body("Deleted Student Records");
    	}
    	
    }
}
