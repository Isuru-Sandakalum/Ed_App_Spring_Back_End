package com.example.demo.service;

import com.example.demo.jpa.TeacherDAO;
import com.example.demo.model.Teacher;
import com.example.demo.model.dto.StudentUserRq;
import com.example.demo.model.dto.TeacherDTO;
import com.example.demo.model.dto.TeacherUserRq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherDAO teacherDAO;


    public List<Teacher> getAllStudents(){
        List<Teacher>allTeacher = teacherDAO.findAll();
        return allTeacher;
    }

    public Teacher getTeacherByID(Integer tId){
        Teacher teacher = teacherDAO.findByTeacherID(tId);
        return teacher;
    }

    public TeacherDTO getLoggedUser(TeacherUserRq teacherUserRq){
        Teacher teacher = this.teacherDAO.findByUserNameAndPassword(teacherUserRq.getUserName(),teacherUserRq.getPassword());
        TeacherDTO teacherDTO = null;
        if (teacher!=null){
            teacherDTO = new TeacherDTO(teacher);
        }
        return teacherDTO;

    }


    //Save and Update Teacher
    public TeacherDTO saveAndUpdateTeachers(TeacherDTO teacherDTO){
            Teacher teacher = null;
            if (teacherDTO.getTeacherID()!=null){
                teacher = teacherDAO.findByTeacherID(teacherDTO.getTeacherID());
            }else{
                teacher = new Teacher();
            }

            teacher.setTeacherID(teacherDTO.getTeacherID());
            teacher.setUserName(teacherDTO.getUserName());
            teacher.setPassword(teacher.getPassword());

            teacher = teacherDAO.saveAndFlush(teacher);
            TeacherDTO teacherDTO1 = new TeacherDTO(teacher);
            return teacherDTO1;
    }

}
