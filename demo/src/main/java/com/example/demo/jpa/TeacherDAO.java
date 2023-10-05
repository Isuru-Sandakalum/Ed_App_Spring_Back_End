package com.example.demo.jpa;

import com.example.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDAO extends JpaRepository<Teacher, Integer> {
    Teacher findByUserNameAndPassword(String userName , String password);
    Teacher findByTeacherID(Integer tId);
}
