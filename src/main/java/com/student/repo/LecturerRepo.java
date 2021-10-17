package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Lecturer;

public interface LecturerRepo extends JpaRepository<Lecturer, Integer>{

}
