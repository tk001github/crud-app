package com.example.assignment.Dtos;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

public class StudentUpdateDTO {
    @Getter @Setter
    private Integer rollNo;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer std;
    @Getter @Setter
    private String age;
}
