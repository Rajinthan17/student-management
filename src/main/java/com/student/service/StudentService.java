package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repo.StudentRepo;

@Service
public class StudentService {
	
	
	@Autowired
	StudentRepo studentRepo;
}
