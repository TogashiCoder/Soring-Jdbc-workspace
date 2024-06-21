package com.togashi.springjdbc.repository;

import com.togashi.springjdbc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//like component but we montion that is belong to repository layer
@Repository
public class StudentRepository {

private JdbcTemplate jdbc;


    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student)
    {
        String sql = "insert into student (id,name,marks) values (?,?,?)";
       int rows= jdbc.update(sql,student.getId(),student.getName(),student.getMarks());
        System.out.println(rows + "Effected");
    }

    public List<Student> findAll() {

        String sql = "select * from student;";
        //i am not implemets this function yet
        List<Student> students = new ArrayList<>();
        return students;
    }
}
