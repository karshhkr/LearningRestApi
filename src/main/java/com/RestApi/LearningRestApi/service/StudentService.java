package com.RestApi.LearningRestApi.service;

import com.RestApi.LearningRestApi.dto.AddStudentsRequest;
import com.RestApi.LearningRestApi.dto.StudentDto;
import com.RestApi.LearningRestApi.entity.Student;

import java.lang.invoke.CallSite;
import java.util.List;
import java.util.Map;

public interface StudentService {
    List<StudentDto> getAllStudents();

    StudentDto getAllStudentsById(Long id);

    StudentDto createNewStudent(AddStudentsRequest addStudentsRequest);

    void deleteStudentById(Long id);

    StudentDto updateStudent(Long id, AddStudentsRequest addStudentsRequest);

    StudentDto updatePartialStudent(Long id, Map<String, Object> update);
}

