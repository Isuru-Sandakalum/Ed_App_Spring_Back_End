package com.example.demo.service;

import com.example.demo.jpa.StudentDAO;
import com.example.demo.model.Student;
import com.example.demo.model.dto.StudentDTO;
import com.example.demo.model.dto.StudentUserRq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getAllStudents() {
        List<Student> allStudents = studentDAO.findAll();
        return allStudents;
    }

    public Student getStudentById(Integer sID) {
        Student student = studentDAO.findByStudentID(sID);
        return student;
    }

    public StudentDTO getLoggedUser(StudentUserRq studentUserRq) {
        Student student1 = this.studentDAO.findByUserNameAndPassword(studentUserRq.getUserName(), studentUserRq.getPassword());
        StudentDTO studentDTO = null;
        if (student1 != null) {
            studentDTO = new StudentDTO(student1);
        }
        return studentDTO;

    }

    //SaveAndUpdate
//
//    public StudentDTO saveAndUpdateStudents(StudentDTO studentDTO) {
//        Student student = null;
//        if (studentDTO.getStudentID() != null){
//            student = this.studentDAO.findByStudentID(studentDTO.getStudentID());
//        }else{
//            student = new Student();
//        }
//
//        student.setUserName(studentDTO.getUserName());
//        student.setPassword(studentDTO.getPassword());
//
//        student =this.studentDAO.saveAndFlush(student);
//        return new StudentDTO(student);
//    }


public Student addStudent(Student student){
 Student student1 =this.studentDAO.saveAndFlush(student);
 return student1;
}


}
