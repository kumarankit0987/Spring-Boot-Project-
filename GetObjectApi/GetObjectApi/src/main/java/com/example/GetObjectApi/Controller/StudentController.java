package com.example.GetObjectApi.Controller;

import com.example.GetObjectApi.Entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudent(){
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("Ankit",121);
        Student student2 = new Student("Rahul",324);
        Student student3 = new Student("Shiv",467);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        return studentList;
    }
}
