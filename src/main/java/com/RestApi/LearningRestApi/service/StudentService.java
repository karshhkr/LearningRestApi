package com.RestApi.LearningRestApi.service;

import com.RestApi.LearningRestApi.dto.StudentDto;
import com.RestApi.LearningRestApi.entity.Student;

import java.lang.invoke.CallSite;
import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
}
