package com.example.PostObjectApi.Controller;

import com.example.PostObjectApi.Entity.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> studentList = new ArrayList<>();
    @GetMapping("/students")
    public List<Student> get(){

       Student s1 = new Student("Ram",121);
       Student s2 = new Student("Kemal",321);
       Student s3 = new Student("Suraj",432);
       //Add Students into the List
       studentList.add(s1);
       studentList.add(s2);
       studentList.add(s3);
       return studentList;
    }

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student){
        studentList.add(student);
        return "Student Added Successfully";
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        for(Student student : studentList){
           if(student.getId() == id){
               return student;
            }
        }
        return null;
    }

}
