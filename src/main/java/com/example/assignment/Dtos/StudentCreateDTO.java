package com.example.assignment.Dtos;

import lombok.Getter;
import lombok.Setter;

public class StudentCreateDTO {
    @Getter @Setter
    private Integer rollNo;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer std;
    @Getter @Setter
    private Integer age;

    public StudentCreateDTO(){
    }
}
