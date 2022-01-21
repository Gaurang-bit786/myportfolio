package com.crud.crud.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.crud.crud.Repository.StudentRepository;
import com.crud.crud.entities.StudentEntities;

import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudentServiceImple implements StudentService{



    @Autowired
    private StudentRepository studentRepo;

    @Override
    public StudentEntities createStudentData(StudentEntities std) {
        return  studentRepo.save(std);
    }

    @Override
    public StudentEntities updateStudentData(StudentEntities std,int id) {
        Optional<StudentEntities> studentEntity2 = this.studentRepo.findById(id);
        
        System.out.println("student is"+std);
        System.out.println("id is"+id);
  
            StudentEntities studentUpdate = studentEntity2.get();
            studentUpdate.setId(std.getId());
            studentUpdate.setName(std.getName());
            studentUpdate.setClas(std.getClas());
            studentUpdate.setAddress(std.getAddress());
            studentUpdate.setImage(std.getImage());
            studentRepo.save(studentUpdate);
            return studentUpdate;
        
    }

    @Override
    public List<StudentEntities> getAllData(){
        return this.studentRepo.findAll(); 
    }    

    @Override
    public StudentEntities getStudentById(int id) {
        Optional<StudentEntities> studentEntity2 = this.studentRepo.findById(id);
        
        
            return studentEntity2.get();
 
    }

    @Override
    public void deleteStudent(int id) {
        Optional<StudentEntities> studentEntity2 = this.studentRepo.findById(id);
        
        if(studentEntity2.isPresent()){
            this.studentRepo.delete(studentEntity2.get());
        }
        
    }
    
}
