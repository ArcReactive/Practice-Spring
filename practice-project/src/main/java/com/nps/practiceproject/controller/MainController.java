package com.nps.practiceproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nps.practiceproject.model.Student;
import com.nps.practiceproject.service.StudentService;

@RestController
public class MainController {

	@Autowired
	StudentService StudentService;
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMain(){
        return "Test Main Complete";
    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
		return StudentService.save(student);
    }

}
