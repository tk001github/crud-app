package com.example.assignment.Services;

import com.example.assignment.Dtos.StudentCreateDTO;
import com.example.assignment.Models.Student;
import com.example.assignment.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private Mapper mapper;
    @Autowired
    private StudentRepository studentRepository;

    public void create(StudentCreateDTO studentCreateDTO){
        Student student = mapper.toStudent(studentCreateDTO);
        studentRepository.save(student);
    }
}
