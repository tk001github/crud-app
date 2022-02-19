package com.example.assignment.Services;

import com.example.assignment.Dtos.StudentCreateDTO;
import com.example.assignment.Dtos.StudentGetDTO;
import com.example.assignment.Dtos.StudentUpdateDTO;
import com.example.assignment.Models.Student;
import com.example.assignment.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {
    @Autowired
    private Mapper mapper;
    @Autowired
    private StudentRepository studentRepository;

    public StudentGetDTO getByRollNo(Integer rollNo){
        Student student = null;
        Optional<Student> stud = studentRepository.findByRollNo(rollNo);

        if(stud.isPresent()){
            student = stud.get();
        }
        StudentGetDTO studentGetDTO = mapper.toStudentGetDTO(student);
        return studentGetDTO;
    }

    public List<StudentGetDTO> getByName(String name){
        List<StudentGetDTO> studentList = new ArrayList<>();
        List<Student> stud = studentRepository.findByName(name);
        for (Student student:stud) {
            StudentGetDTO studentGetDTO = mapper.toStudentGetDTO(student);
            studentList.add(studentGetDTO);
        }
        return studentList;
    }


    public void create(StudentCreateDTO studentCreateDTO){
        Student student = mapper.toStudent(studentCreateDTO);
        studentRepository.save(student);
    }

    public void update(Integer rollNo, StudentUpdateDTO studentUpdateDTO){
        Student student = null;
        Optional<Student> stud = studentRepository.findByRollNo(rollNo);
        if(stud.isPresent()){
            student = stud.get();
        }
        if(student != null){
            if(studentUpdateDTO.getAge() != null) student.setAge(studentUpdateDTO.getAge());
            if(studentUpdateDTO.getName() != null) student.setName(studentUpdateDTO.getName());
            if(studentUpdateDTO.getStd() != null) student.setStd(studentUpdateDTO.getStd());
            studentRepository.save(student);
        }
    }

    public void deleteByRollNo(Integer rollNo){
        long delCount = studentRepository.deleteByRollNo(rollNo);
    }

    public void deleteByName(String name){
        long delCount = studentRepository.deleteByName(name);
    }
}
