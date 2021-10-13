package com.atoy.studentmanagementsystem.repository;
// Created by: Ali Artukov
// Created time: 10/12/2021 12:16 AM
// Telegram: https://t.me/Ali_Artukov

import com.atoy.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
