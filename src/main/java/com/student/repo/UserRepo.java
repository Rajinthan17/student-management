package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
