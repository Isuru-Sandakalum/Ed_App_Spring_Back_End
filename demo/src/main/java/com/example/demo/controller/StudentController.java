package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.dto.StudentDTO;
import com.example.demo.model.dto.StudentUserRq;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = this.studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }


    @RequestMapping(value = "/getLoggedUser", method = RequestMethod.POST)
    public ResponseEntity<StudentDTO> getLoggedUser(@RequestBody StudentUserRq studentUserRq) {
        StudentDTO studentDTO = this.studentService.getLoggedUser(studentUserRq);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }


    @RequestMapping(value = "getStudentById/{studentID}", method = RequestMethod.GET)
    public ResponseEntity<Student> getStudentById(@PathVariable Integer sID) {
        Student student = this.studentService.getStudentById(sID);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

//    @RequestMapping(value = "saveAndUpdateStudents",method = RequestMethod.POST)
//    public ResponseEntity<StudentDTO>saveAndUpdateStudents(@RequestBody StudentDTO studentDTO){
//        StudentDTO newStudent = this.studentService.saveAndUpdateStudents(studentDTO);
//        return new ResponseEntity<>(newStudent,HttpStatus.OK);
//    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        //Student student1 = studentService.getStudentById(student.getStudentID());
        Student newStudent = this.studentService.addStudent(student);
        return new ResponseEntity<>(newStudent, HttpStatus.CREATED);
    }


}
