package com.example.Student_Management.repository;

import com.example.Student_Management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {


    @Query(nativeQuery = true,
            value = "SELECT * FROM student WHERE technology = :technology AND gender = :gender")
    List<Student> findByTechnologyAndGender(
            @Param("technology") String technology, @Param("gender") String gender);

    List<Student> findByTechnology(String technology);

    List<Student> findByGender(String gender);
}
