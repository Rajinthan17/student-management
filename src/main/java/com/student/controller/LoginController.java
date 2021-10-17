package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.LoginService;

@RestController
@RequestMapping("/api/auth")
public class LoginController {

	@Autowired
	LoginService loginService;
}
