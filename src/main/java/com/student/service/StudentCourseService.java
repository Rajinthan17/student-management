package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repo.StudentCourseRepo;

@Service
public class StudentCourseService {
	
	
	@Autowired
	StudentCourseRepo studentCourseRepo;
}
