package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.model.Student;
import com.example.service.StudentService;

import java.util.List;
import java.util.Optional;

//used postman for testing application crud operations.
@RestController
@RequestMapping("/api/students")
public class StudentController {
 @Autowired
 private StudentService studentService;

 @GetMapping
 public List<Student> getAllStudents() {
     return studentService.getAllStudents();
 }

 @GetMapping("/{id}")
 public Optional<Student> getStudentById(@PathVariable Long id) {
     return studentService.getStudentById(id);
 }

 @PostMapping
 public void addStudent(@RequestBody Student student) {
     studentService.addStudent(student);
 }

 @PostMapping("/update")
 public void updateStudent(@RequestBody Student student) {
     studentService.updateStudent(student);
 }

 @DeleteMapping("/{id}")
 public void deleteStudent(@PathVariable Long id) {
     studentService.deleteStudent(id);
 }
}
