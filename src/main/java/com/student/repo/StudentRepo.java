package com.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
