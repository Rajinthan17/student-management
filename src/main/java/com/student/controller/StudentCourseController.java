package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.StudentCourseService;


@RestController
@RequestMapping("/api/student/course")
public class StudentCourseController {
	
	@Autowired
	StudentCourseService studentCourseService;

}
