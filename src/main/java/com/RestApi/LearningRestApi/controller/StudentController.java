package com.RestApi.LearningRestApi.controller;

import com.RestApi.LearningRestApi.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {




// Api mapping
    @GetMapping("/students")

       public StudentDto getStudent(){
            return  new StudentDto(4l, "Utkarsh Kumar","Dabgarwal", " karshkr@gmail.com");
    }
}
