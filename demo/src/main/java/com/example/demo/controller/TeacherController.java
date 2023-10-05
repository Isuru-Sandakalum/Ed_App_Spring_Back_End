package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.Teacher;
import com.example.demo.model.dto.StudentUserRq;
import com.example.demo.model.dto.TeacherDTO;
import com.example.demo.model.dto.TeacherUserRq;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "/getLoggedUserTeacher",method = RequestMethod.POST)
    public ResponseEntity<TeacherDTO> getLoggedUserTeacher(@RequestBody TeacherUserRq teacherUserRq){
        TeacherDTO teacherDTO = this.teacherService.getLoggedUser(teacherUserRq);
        return new ResponseEntity<>(teacherDTO, HttpStatus.OK);
    }

    @RequestMapping(value = "/getTeacherByID/{teacherID}",method = RequestMethod.GET)
    public ResponseEntity<Teacher>getTeacherById(@PathVariable Integer tID){
        Teacher teacher = this.teacherService.getTeacherByID(tID);
        return new ResponseEntity<>(teacher,HttpStatus.OK);

    }



}
