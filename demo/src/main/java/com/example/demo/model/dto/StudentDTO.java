package com.example.demo.model.dto;

import com.example.demo.model.Course;
import com.example.demo.model.Student;

public class StudentDTO {

    private Integer studentID;
    private String userName;
    private String password;
//    private Course courseName;

    public StudentDTO(){

    }

    public StudentDTO(Student student) {
        this.studentID = student.getStudentID();
        this.userName = student.getUserName();
        this.password = student.getPassword();
//        this.courseName = student.getCourseName();

    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public Course getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(Course courseName) {
//        this.courseName = courseName;
//    }
}
