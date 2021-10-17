package com.student.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.entities.Course;
import com.student.repo.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;

	public ResponseEntity<?> addCourse(@Valid Course course) {
		Course savedCourse = new Course(
								course.getName(),
								course.getFees(),
								course.getDuration()
							);
		courseRepo.save(savedCourse);
		return new ResponseEntity<>(savedCourse,HttpStatus.CREATED);
	}
	
	

}
