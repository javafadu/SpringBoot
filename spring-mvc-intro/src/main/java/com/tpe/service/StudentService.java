package com.tpe.service;

import com.tpe.domain.Student;
import com.tpe.exception.ResourceNotFoundException;

import java.util.List;

public interface StudentService {

    public List<Student> getAll();
    public List<Student> findStudents(String lastName);

    Student findStudent(Long id) throws ResourceNotFoundException;
    
    void createStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Long id);


}