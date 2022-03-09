package com.osomhecode.studentsystem.services;

import com.osomhecode.studentsystem.model.Student;
import com.osomhecode.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp  implements  StudentService{
   @Autowired
   private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
