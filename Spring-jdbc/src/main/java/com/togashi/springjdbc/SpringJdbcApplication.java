package com.togashi.springjdbc;

import com.togashi.springjdbc.model.Student;
import com.togashi.springjdbc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

        Student student1 = context.getBean(Student.class);
        student1.setId(1);
        student1.setName("Taoufik");
        student1.setMarks(100);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(student1);

        List<Student> students = service.getAllStudents();

    }

}
