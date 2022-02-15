package com.example.assignment.Controllers;

import com.example.assignment.Dtos.StudentCreateDTO;
import com.example.assignment.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @Autowired
    private StudentService studentService;

    @GetMapping({"/","/home"})
    public String home(){
        return "<marquee/><br/><h1/>Welcome to the App!";
    }

    @PostMapping("/student/create")
    public void createStudent(@RequestBody StudentCreateDTO studentCreateDTO){
        studentService.create(studentCreateDTO);
    }

}
