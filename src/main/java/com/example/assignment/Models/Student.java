package com.example.assignment.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id @Getter @Setter
    private Integer rollNo;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Integer std;
    @Getter @Setter
    private String age;
}
