package com.crud.crud.service;

import com.crud.crud.entities.StudentEntities;
import java.util.List;


public interface StudentService {
    StudentEntities createStudentData(StudentEntities std);
    StudentEntities updateStudentData(StudentEntities std,int id);
    List<StudentEntities> getAllData();    
    StudentEntities getStudentById(int id);
    void deleteStudent(int id);
}
