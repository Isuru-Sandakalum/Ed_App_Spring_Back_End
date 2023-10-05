package com.example.demo.jpa;

import com.example.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDAO extends JpaRepository<Student,Integer> {

    Student findByUserNameAndPassword(String userName , String password);
    Student findByStudentID(Integer sID);


}
