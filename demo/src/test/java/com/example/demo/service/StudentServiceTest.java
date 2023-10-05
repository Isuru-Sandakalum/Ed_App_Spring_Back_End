package com.example.demo.service;

import com.example.demo.model.dto.StudentDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;


    @Test
    void getAllStudents() {

        this.studentService.getAllStudents();
    }


}