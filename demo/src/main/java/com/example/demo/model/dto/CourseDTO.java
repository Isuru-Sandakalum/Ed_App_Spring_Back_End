package com.example.demo.model.dto;

import com.example.demo.model.Course;

import java.sql.Blob;

public class CourseDTO {


    private Integer courseId;
    private String courseName;
    private Integer coursePrice;
    private String description;
    private String teacher;



    public CourseDTO(){

    }



    public CourseDTO(Course course) {
        this.courseId = course.getCourseId();
        this.courseName = course.getCourseName();
        this.coursePrice = course.getCoursePrice();
        this.description = course.getDescription();
        this.teacher = course.getTeacher();

    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Integer coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
