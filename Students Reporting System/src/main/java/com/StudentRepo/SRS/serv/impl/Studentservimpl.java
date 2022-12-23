package com.StudentRepo.SRS.serv.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentRepo.SRS.entity.Student;
import com.StudentRepo.SRS.repository.StudentRepo;
import com.StudentRepo.SRS.serv.Studentserv;


@Service
public class Studentservimpl implements  Studentserv{

	private StudentRepo studentRepo;
	
	
	
	
	public Studentservimpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}




	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}
	
	
	
}
