package com.crud.crud.Repository;

import com.crud.crud.entities.StudentEntities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntities,Integer>{
    
}
