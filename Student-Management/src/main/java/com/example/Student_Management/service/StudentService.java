package com.example.Student_Management.service;

import com.example.Student_Management.model.Student;
import com.example.Student_Management.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<Student> createStudent(Student student) {
        if(student.getEmail() == null || student.getGender() == null ||
                student.getName() == null || student.getTechnology() == null ||student.getId() != null)
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Enter valid parameters");
        studentRepo.save(student);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<Student> updateStudent(Long id, Student st) {
        Student student = studentRepo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        if(st.getName()!=null)  student.setName(st.getName());
        if(st.getEmail()!=null)  student.setEmail(st.getEmail());
        if(st.getGender()!=null)  student.setGender(st.getGender());
        if(st.getTechnology()!=null)  student.setTechnology(st.getTechnology());
        studentRepo.save(student);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


    public ResponseEntity<Student> deleteStudent(Long id) {
        Student student = studentRepo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        studentRepo.delete(student);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    public List<Student> getStudentsByTechnology(String tech) {
        return studentRepo.findByTechnology(tech);
    }

    public List<Student> getStudentsByGender(String gender) {
        return studentRepo.findByGender(gender);
    }

    public List<Student> getStudentsByTechnologyAndGender(String technology, String gender) {
        return studentRepo.findByTechnologyAndGender(technology,gender);
    }
}
