package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repo.AdminRepo;

@Service
public class AdminService {

	
	@Autowired
	AdminRepo adminRepo;
}
