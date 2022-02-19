package com.example.demo.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/vi/student")
public class StudentController {

    @Autowired
    private  final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents(){
 return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(Student student){
        studentService.addNewStudent(student);
    }
@DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long id){
    studentService.deleteStudent(studentId);
    }
}
