package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
}
