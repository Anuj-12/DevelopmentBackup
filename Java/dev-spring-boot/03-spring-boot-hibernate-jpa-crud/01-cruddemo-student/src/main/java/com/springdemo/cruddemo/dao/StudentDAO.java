package com.springdemo.cruddemo.dao;

import com.springdemo.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theSudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
