package com.example.assignment.Repositories;

import com.example.assignment.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
    Optional<Student> findByRollNo(Integer rollNo);
    List<Student> findByName(String name);
    long deleteByRollNo(Integer rollNo);
    long deleteByName(String name);
}
