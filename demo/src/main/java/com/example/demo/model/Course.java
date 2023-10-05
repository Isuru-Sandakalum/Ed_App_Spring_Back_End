package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courseid")
    private Integer courseId;

    @Column(name = "coursename")
    private String courseName;

    @Column(name = "courseprize")
    private Integer coursePrice;

    @Column(name = "description")
    private String description;

    @Column(name = "teacher")
    private String teacher;


    public Course() {

    }

    public Course(String courseName, Integer coursePrice, String description, String teacher) {
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.description = description;
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

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
