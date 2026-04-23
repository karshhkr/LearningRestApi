package com.RestApi.LearningRestApi.service.Implementation;

import com.RestApi.LearningRestApi.dto.StudentDto;
import com.RestApi.LearningRestApi.entity.Student;
import com.RestApi.LearningRestApi.repository.StudentRepository;
import com.RestApi.LearningRestApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

@Service// this class will write all the buisness logic here
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {   // class will talk to persistence layer Db se baat kregi

    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> getAllStudents() {

        // 1. DB se data lo (Entity)
        List<Student> students = studentRepository.findAll();

        // 2. Entity -> DTO convert karo using stream
        List<StudentDto> studentDtoList = students
                .stream()
                .map(student -> new StudentDto(
                        student.getId(),
                        student.getName(), // firstName me daal diya
                        "",                // lastName empty
                        student.getEmail()
                ))
                .toList();
        return studentDtoList;
    }



}
