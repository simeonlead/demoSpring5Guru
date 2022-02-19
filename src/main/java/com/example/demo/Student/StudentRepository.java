package com.example.demo.Student;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {

    @Query("SELECT s FROM Student s WHERE s.email =?1")
    Optional<Student> findStudentByEmail(String email);
}
