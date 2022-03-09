package com.osomhecode.studentsystem.services;

import com.osomhecode.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
