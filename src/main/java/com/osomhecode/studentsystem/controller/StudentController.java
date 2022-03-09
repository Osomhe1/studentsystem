package com.osomhecode.studentsystem.controller;

import com.osomhecode.studentsystem.model.Student;
import com.osomhecode.studentsystem.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
//        System.out.println(student);
        return "New Student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
//        System.out.println(studentService);
        return studentService.getAllStudents();
    }

}
