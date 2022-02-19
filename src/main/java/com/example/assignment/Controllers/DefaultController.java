package com.example.assignment.Controllers;

import com.example.assignment.Commons.AppLogger;
import com.example.assignment.Dtos.StudentCreateDTO;
import com.example.assignment.Dtos.StudentGetDTO;
import com.example.assignment.Dtos.StudentUpdateDTO;
import com.example.assignment.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DefaultController {

    @Autowired
    private StudentService studentService;

    @GetMapping({"/","/home"})
    public String home(){
        return "<marquee/><br/><h1/>Welcome to the App!";
    }

    @GetMapping({"/student/{rollNo}/get"})
    public StudentGetDTO getStudentByRollNo(@PathVariable Integer rollNo){
        return studentService.getByRollNo(rollNo);
    }

    @GetMapping({"/student/{name}/getAll"})
    public List<StudentGetDTO> getStudentByName(@PathVariable String name){
        return studentService.getByName(name);
    }

    @PostMapping("/student/create")
    public ResponseEntity<String> createStudent(@RequestBody StudentCreateDTO studentCreateDTO){
        try {
            studentService.create(studentCreateDTO);
        }
        catch (Exception e){
            AppLogger.error(e.getLocalizedMessage());
            return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @PutMapping("/student/{rollNo}/update")
    public ResponseEntity<String> updateStudent(@PathVariable("rollNo") Integer rollNo, @RequestBody StudentUpdateDTO studentUpdateDTO){
        try {
            studentService.update(rollNo, studentUpdateDTO);
        }
        catch (Exception e){
            AppLogger.error(e.getLocalizedMessage());
            return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @DeleteMapping("/student/{rollNo}/delete")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer rollNo){
        try {
            studentService.deleteByRollNo(rollNo);
        }
        catch (Exception e){
            AppLogger.error(e.getLocalizedMessage());
            return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @DeleteMapping("/student/{name}/deleteAll")
    public ResponseEntity<String> deleteStudentByName(@PathVariable String name){
        try {
            studentService.deleteByName(name);
        }
        catch (Exception e){
            AppLogger.error(e.getLocalizedMessage());
            return new ResponseEntity<>("Failed", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
