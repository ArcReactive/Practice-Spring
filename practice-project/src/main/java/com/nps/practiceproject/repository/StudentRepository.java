package com.nps.practiceproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nps.practiceproject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
