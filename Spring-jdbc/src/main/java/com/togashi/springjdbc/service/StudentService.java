package com.togashi.springjdbc.service;

import com.togashi.springjdbc.model.Student;
import com.togashi.springjdbc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //(like component but we montion that is belong to service layer)
public class StudentService {

    private StudentRepository repository;

    public StudentRepository getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    public void addStudent(Student student)
    {
        repository.save(student);
    }

    public List<Student> getAllStudents()
    {
        return repository.findAll();
    }
}
