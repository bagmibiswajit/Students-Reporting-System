package com.StudentRepo.SRS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentRepo.SRS.entity.Student;



public interface StudentRepo extends JpaRepository< Student , Integer >{
}
