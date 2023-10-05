package com.example.demo.model.dto;

import com.example.demo.model.Course;
import com.example.demo.model.Teacher;

public class TeacherDTO {


    private Integer teacherID;
    private String userName;
    private String password;

    public TeacherDTO(){

    }

    public TeacherDTO(Teacher teacher) {
        this.teacherID = teacher.getTeacherID();
        this.userName = teacher.getUserName();
        this.password = teacher.getPassword();
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
