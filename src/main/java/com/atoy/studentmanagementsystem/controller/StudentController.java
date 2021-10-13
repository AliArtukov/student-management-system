package com.atoy.studentmanagementsystem.controller;
// Created by: Ali Artukov
// Created time: 10/12/2021 12:21 AM
// Telegram: https://t.me/Ali_Artukov

import com.atoy.studentmanagementsystem.entity.Student;
import com.atoy.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/student")
public class StudentController {

    final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/new")
    public String createStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_student";
    }

    @PostMapping("/new")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/api/student";
    }

    @GetMapping("/edit/{id}")
    public String editStudentFrom(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/edit/{id}")
    public String saveUpdatedStudent(@PathVariable Long id, @ModelAttribute("student") Student student) {
        studentService.saveUpdatedStudent(id, student);
        return "redirect:/api/student";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/api/student";
    }

}
