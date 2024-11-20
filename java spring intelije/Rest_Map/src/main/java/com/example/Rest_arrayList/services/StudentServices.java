package com.example.Rest_arrayList.services;

import com.example.Rest_arrayList.models.Student;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class StudentServices {

    private Map<Integer, Student> studentMap=new LinkedHashMap<>();

    private AtomicInteger atomicInteger=new AtomicInteger();

    public Collection<Student>  getAllStudents(){
       return studentMap.values();
    }

    public void createstudent(Student student){

        int roll_no=atomicInteger.incrementAndGet();
        student.setRollNumber(roll_no);
        studentMap.put(student.getRollNumber(), student);
    }

    public ResponseEntity<?> getStudentByRollNo(int rollNo){

      Student student = studentMap.get(rollNo);
        if(student==null){
            return new ResponseEntity<> ("no student found with roll no "+rollNo, HttpStatus.NOT_FOUND);
        }
        else{
            return new ResponseEntity<>(student,HttpStatus.OK);
        }
    }

    public ResponseEntity<?> updateStudent(int rollNo,Student student){
        Student existing_student=studentMap.get(rollNo);
        if(existing_student==null){
            return new ResponseEntity<>("no student found with roll no",HttpStatus.NOT_FOUND);
        }
        else{
            student.setRollNumber(rollNo);
            studentMap.put(rollNo, student);
            return new ResponseEntity<>(studentMap.get(rollNo),HttpStatus.OK);
        }

    }

    public String removeStudent(int rollNo){
        Student existing_student=studentMap.get(rollNo);
        if(existing_student==null){
            return "no student with given roll  number";
        }
        else{
           studentMap.remove(rollNo);
           return "removed Successfully";
        }
    }
}
