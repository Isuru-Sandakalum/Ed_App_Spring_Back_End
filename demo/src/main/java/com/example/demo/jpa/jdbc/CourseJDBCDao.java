//package com.example.demo.jpa.jdbc;
//
//import com.example.demo.model.Course;
//import com.example.demo.model.dto.CourseDTO;
//import com.example.demo.model.dto.SearchRQ;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.ResultSetExtractor;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//
//
//@Repository
//public class CourseJDBCDao {
//
//    @Autowired
//    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
//
//    public List<Course> getAllCourseSearch(SearchRQ searchRQ) {
//        List<Course> result = new ArrayList<>();
//
//        Map<String, Object> params = new HashMap<>();
//
//        StringBuilder SQL = new StringBuilder();
//        SQL.append("SELECT\n");
//        SQL.append("   c.coursename,\n");
//        SQL.append("   c.courseprize,\n");
//        SQL.append("   c.courseid,\n");
//        SQL.append("   c.teacher,\n");
//        SQL.append("   c.description\n");
//        SQL.append("FROM\n");
//        SQL.append("WHERE  c.courseid is not null;\n");
//
//        if (searchRQ.getCourseName() != null && !searchRQ.getCourseName().equals("")){
//            SQL.append(" AND c.coursename like '%"+searchRQ.getCourseName()+"%'\n");
//        }
//        if (searchRQ.getTeacher()!=null && !searchRQ.getTeacher().equals("")){
//            SQL.append(" AND c.teacher  like '%"+searchRQ.getTeacher()+"%';\n");
//        }
//
//
//        return namedParameterJdbcTemplate.query(SQL.toString(), params, new ResultSetExtractor<List<Course>>() {
//            @Override
//            public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException {
//                while (rs.next()) {
//                    Course course = new Course();
//                    course.setCourseName(rs.getString("coursename"));
//                    course.setTeacher(rs.getString("teacher"));
//                    course.setCourseId(rs.getInt("courseid"));
//                    course.setDescription(rs.getString("description"));
//                    course.setCoursePrice(rs.getInt("courseprize"));
//                    result.add(course);
//
//                }
//                return result;
//            }
//        });
//    }
//
//
//}
