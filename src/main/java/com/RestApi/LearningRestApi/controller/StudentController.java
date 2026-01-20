package com.RestApi.LearningRestApi.controller;

import com.RestApi.LearningRestApi.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudents() {
return  new StudentDto(4L, "Utkarsh", "Kumar" , "utkarshkumardabgarwal@gmail.com");
    }
}
