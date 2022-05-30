package com.nps.practiceproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMain(){
        return "Test Main Complete";
    }


}
