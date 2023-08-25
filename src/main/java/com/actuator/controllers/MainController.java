package com.actuator.controllers;

import com.actuator.helper.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MainController {

    @Autowired
    private Student student;

    //mapping
    @GetMapping("/get-data")
    public Map<String, String> getData() {

        return Map.of("Name", "Tuhin Kumar");
    }
}
