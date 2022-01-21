package com.crud.crud.controller;

import com.crud.crud.entities.StudentEntities;
import com.crud.crud.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;  


@RestController
public class StudentController {

    @Autowired
    private StudentService std;

    @GetMapping("/student")
    public ResponseEntity<List<StudentEntities>> allStudent(){
        return ResponseEntity.ok().body(std.getAllData());
    }

    @PostMapping("/student")
    public ResponseEntity<StudentEntities> createStudent(@RequestBody StudentEntities student){
        return ResponseEntity.ok().body(this.std.createStudentData(student));
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<StudentEntities> updateProduct(@PathVariable("id") Integer id, @RequestBody StudentEntities student){
        return ResponseEntity.ok().body(std.updateStudentData(student,id));
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id){
        this.std.deleteStudent(id);
        return ( ResponseEntity<?> )ResponseEntity.status(HttpStatus.OK);
    }
}
