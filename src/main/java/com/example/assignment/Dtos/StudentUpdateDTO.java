package com.example.assignment.Dtos;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class StudentUpdateDTO {
    @Getter @Setter
    private String name = null;
    @Getter @Setter
    private Integer std = null;
    @Getter @Setter
    private Integer age = null;

    public StudentUpdateDTO(){
    }
}
