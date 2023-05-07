package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);
    Student findById(int id);

    List<Student> findAll();
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);
    void remove(int id);
    int deleteAll();
}
