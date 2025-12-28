package com.example.Student_Management.controller;

import com.example.Student_Management.model.Student;
import com.example.Student_Management.repository.StudentRepo;
import com.example.Student_Management.service.StudentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") Long id){
        return studentService.getStudentById(id);
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id, @RequestBody Student student){
        return studentService.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable("id") Long id){
        return studentService.deleteStudent(id);
    }

    @GetMapping("/technology/{tech}")
    public List<Student> getStudentByTechnology(@PathVariable("tech") String tech){
        return studentService.getStudentsByTechnology(tech);
    }

    @GetMapping("/gender/{gender}")
    public List<Student> getStudentByGender(@PathVariable("gender") String gender){
        return studentService.getStudentsByGender(gender);
    }

    @PostMapping("/filter")
    public List<Student> getStudentByTechnologyAndGender(
            @Param("technology") String technology, @Param("gender") String gender){
        return studentService.getStudentsByTechnologyAndGender(technology,gender);
    }
}
