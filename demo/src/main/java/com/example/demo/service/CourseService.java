package com.example.demo.service;

import com.example.demo.jpa.CourseDAO;
import com.example.demo.model.Course;
import com.example.demo.model.dto.CourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;
//
//    @Autowired
//    private CourseJDBCDao courseJDBCDao;

    public List<Course>geTAllCourses(){
        List<Course> allCourses = courseDAO.findAll();
        return allCourses;
    }

    public CourseDTO getCourseById(Integer cid){
        Course course = this.courseDAO.findByCourseId(cid);
        return new CourseDTO(course);
    }

    //saveAndUpdate
    public CourseDTO saveAndUpdate(CourseDTO courseDTO){
        Course course = null;
        if (courseDTO.getCourseId()!=null){
            course = this.courseDAO.findByCourseId(courseDTO.getCourseId());
        }else{
            course = new Course();
        }
        course.setCourseId(courseDTO.getCourseId());
        course.setCourseName(courseDTO.getCourseName());
        course.setCoursePrice(courseDTO.getCoursePrice());
        course.setDescription(courseDTO.getDescription());
        course.setTeacher(courseDTO.getTeacher());

        course= courseDAO.saveAndFlush(course);
        CourseDTO courseDTO1 = new CourseDTO(course);
        return courseDTO1;

    }

    //Delete by ID
    public Boolean deleteUser(Integer cID){
        Course existingCourse = this.courseDAO.findByCourseId(cID);
        if (existingCourse != null){
            courseDAO.deleteById(cID);
            return true;
        }else{
            return false;
        }

    }
//
//    //search
//    public List<Course>getAllCourseSearch(SearchRQ searchRQ){
//        List<Course> course = this.courseJDBCDao.getAllCourseSearch(searchRQ);
//        return  course;
//    }


}
