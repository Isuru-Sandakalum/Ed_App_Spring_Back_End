package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private Integer studentID;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;


    public Student(){

    }


    public Student(String userName, String password, Course courseName) {
        this.userName = userName;
        this.password = password;
//        this.courseName = courseName;
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

}
