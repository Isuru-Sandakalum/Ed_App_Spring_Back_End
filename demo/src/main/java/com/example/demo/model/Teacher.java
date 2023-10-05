package com.example.demo.model;


import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @Column(name = "Teacherid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teacherID;

    @Column(name = "Username")
    private String userName;

    @Column(name = "Password")
    private String password;

    public Teacher(){

    }

    public Teacher(Integer teacherID, String userName, String password, Course courseName) {
        this.teacherID = teacherID;
        this.userName = userName;
        this.password = password;

    }

    public Integer getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
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
