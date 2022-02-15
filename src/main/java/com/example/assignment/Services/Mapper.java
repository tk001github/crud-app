package com.example.assignment.Services;

import com.example.assignment.Dtos.StudentCreateDTO;
import com.example.assignment.Models.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public Student toStudent(StudentCreateDTO studentCreateDTO){
        Student student = new Student();
        student.setRollNo(studentCreateDTO.getRollNo());
        student.setName(studentCreateDTO.getName());
        student.setAge(studentCreateDTO.getAge());
        student.setStd(studentCreateDTO.getStd());
        return student;
    }
}
