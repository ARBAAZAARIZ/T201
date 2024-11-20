package com.example.Rest_arrayList.controllers;

import com.example.Rest_arrayList.models.Student;
import com.example.Rest_arrayList.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class StudentController {
    @Autowired
    StudentServices studentServices;

    @GetMapping("/students")
    public Collection<Student> getAllStudents(){
        return studentServices.getAllStudents();
    }

    @PostMapping("/students")
    public String createstudent(@RequestBody Student student){
        studentServices.createstudent(student);
        return "new student added";
    }

    @GetMapping("/students/{rollNo}")
    public ResponseEntity<?> getStudentByRollNo( @PathVariable int rollNo){

       return studentServices.getStudentByRollNo(rollNo);

    }

    @PutMapping("/students/{rollNo}")
    public ResponseEntity<?> updateStudent(@PathVariable int rollNo, @RequestBody Student student){
      return  studentServices.updateStudent(rollNo, student);
    }

    @DeleteMapping("students/{rollNo}")
    public String removeStudent(@PathVariable int rollNo){
        return studentServices.removeStudent(rollNo);
    }

}
