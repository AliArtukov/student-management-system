package com.atoy.studentmanagementsystem.service;
// Created by: Ali Artukov
// Created time: 10/12/2021 12:19 AM
// Telegram: https://t.me/Ali_Artukov

import com.atoy.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    Student saveUpdatedStudent(Long id, Student student);

    void deleteStudent(Long id);
}
