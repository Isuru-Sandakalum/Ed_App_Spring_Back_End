package com.example.demo.controller;

import com.example.demo.model.Course;
import com.example.demo.model.dto.CourseDTO;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/getAllCourses", method = RequestMethod.GET)
    public ResponseEntity<List<Course>> gelAllCourse() {
        List<Course> courses = this.courseService.geTAllCourses();
        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    @RequestMapping(value = "/getCourseById/{cId}", method = RequestMethod.GET)
    public ResponseEntity<CourseDTO> getCourseByID(@PathVariable Integer cId) {
        CourseDTO course = this.courseService.getCourseById(cId);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @RequestMapping(value = "/saveAndUpdateCourse", method = RequestMethod.POST)
    public ResponseEntity<CourseDTO> saveAndUpdateCourses(@RequestBody CourseDTO courseDTO) {
        CourseDTO courseDTO1 = this.courseService.saveAndUpdate(courseDTO);

        return new ResponseEntity<>(courseDTO1, HttpStatus.CREATED);
    }

    //delete
    @DeleteMapping(value = "/deleteCourseById/{cID}")
    public ResponseEntity<Boolean> deleteCourse(@PathVariable Integer cID) {
        Boolean results = this.courseService.deleteUser(cID);
        return new ResponseEntity<>(results, HttpStatus.OK);
    }


    //search
//    @RequestMapping(value = "/getAllCoursesSearch", method = RequestMethod.GET)
//    public ResponseEntity<List<Course>> allSearch() {
//        List<Course> courses = this.courseService.getAllCourseSearch();
//        return new ResponseEntity<>(courses, HttpStatus.OK);
//    }

}
