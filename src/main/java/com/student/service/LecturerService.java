package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repo.LecturerRepo;

@Service
public class LecturerService {
	
	@Autowired
	LecturerRepo lecturerRepo;

}
