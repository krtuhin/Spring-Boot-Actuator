package com.actuator.helper;

import org.springframework.stereotype.Component;

//created extra bean

@Component
public class Student {

    public Student() {
        System.out.println("Creating object of Student...!");
    }
}
