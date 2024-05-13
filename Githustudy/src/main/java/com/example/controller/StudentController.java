package com.example.controller;

import com.example.entity.Student;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    public void saveStudent(Student student){

        System.out.println(student);

    }

}
