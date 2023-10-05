package com.example.demo.jpa;

import com.example.demo.model.Course;
import com.example.demo.model.dto.CourseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDAO extends JpaRepository<Course, Integer> {
    Course findByCourseId(Integer cID);
}
