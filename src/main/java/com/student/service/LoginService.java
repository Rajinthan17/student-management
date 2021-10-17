package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired
	LoginRepo loginRepo;

}
