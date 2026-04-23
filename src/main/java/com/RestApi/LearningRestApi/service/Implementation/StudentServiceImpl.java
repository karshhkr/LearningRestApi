package com.RestApi.LearningRestApi.service.Implementation;

import com.RestApi.LearningRestApi.dto.AddStudentsRequest;
import com.RestApi.LearningRestApi.dto.StudentDto;
import com.RestApi.LearningRestApi.entity.Student;
import com.RestApi.LearningRestApi.repository.StudentRepository;
import com.RestApi.LearningRestApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

@Service// this class will write all the buisness logic here
@RequiredArgsConstructor
//  we used serviceimplementation because we can extends the code if future implemetion need we can
public class StudentServiceImpl implements StudentService {   // class will talk to persistence layer Db se baat kregi



    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

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


    @Override
    public StudentDto getAllStudentsById(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("student not found with id: "+id));
return modelMapper.map(student, StudentDto.class);

    }

    @Override
    public StudentDto createNewStudent(AddStudentsRequest addStudentsRequest) {
      Student newStudent = modelMapper.map(addStudentsRequest, Student.class);
      Student student = studentRepository.save(newStudent);
        return modelMapper.map(student, StudentDto.class);
    }


}
