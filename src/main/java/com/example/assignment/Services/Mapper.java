package com.example.assignment.Services;

import com.example.assignment.Dtos.StudentCreateDTO;
import com.example.assignment.Dtos.StudentGetDTO;
import com.example.assignment.Models.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public Student toStudent(StudentCreateDTO studentCreateDTO){
        Student student = new Student();
        student.setRollNo((Integer)studentCreateDTO.getRollNo());
        student.setName(studentCreateDTO.getName());
        student.setAge((Integer)studentCreateDTO.getAge());
        student.setStd((Integer)studentCreateDTO.getStd());
        return student;
    }

    public StudentGetDTO toStudentGetDTO(Student student){
        StudentGetDTO studentGetDTO = new StudentGetDTO();
        studentGetDTO.setRollNo(student.getRollNo());
        studentGetDTO.setName(student.getName());
        studentGetDTO.setAge(student.getAge());
        studentGetDTO.setStd(student.getStd());
        return studentGetDTO;
    }
}
