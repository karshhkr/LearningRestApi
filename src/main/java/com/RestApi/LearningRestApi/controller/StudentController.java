package com.RestApi.LearningRestApi.controller;

import com.RestApi.LearningRestApi.dto.AddStudentsRequest;
import com.RestApi.LearningRestApi.dto.StudentDto;
import com.RestApi.LearningRestApi.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping ("/students")
public class StudentController {
// giving access to the controller of service layer
private final StudentService studentService; // connecting controller(presentation layer)  ---> serviceLayer(Persistance layer )


// Api mapping
@GetMapping

public ResponseEntity <List<StudentDto>>getAllStudents(){
//    return   ResponseEntity
//            .status(HttpStatus.OK)
//            .body(studentService
//                    .getAllStudents());// we have to go to service to getall students

return  ResponseEntity.ok(studentService.getAllStudents());
}


    @GetMapping("/{id}/{name}")// id is path variable which is dynamic part of url

       public ResponseEntity<StudentDto> getStudent(@PathVariable Long id, @PathVariable String name ){ // path variable value  is mapped of  long and inject in mwthod
           // return "Path variable"+id +"Name is "+name;
         StudentDto student=studentService .getAllStudentsById(id);
return ResponseEntity.ok(student);
}




     @PostMapping
     public ResponseEntity<StudentDto> createNewStudent(@RequestBody AddStudentsRequest addStudentsRequest){
return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentsRequest));
     }



      @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
    studentService.deleteStudentById(id);
    return  ResponseEntity.ok().build();






          //patch is for partial changing of information
      }

    //put mapping to change all the information or update
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(
            @PathVariable Long id,
           @RequestBody AddStudentsRequest addStudentsRequest) {
return  ResponseEntity.ok(studentService.updateStudent(id,addStudentsRequest));
    }
    }


