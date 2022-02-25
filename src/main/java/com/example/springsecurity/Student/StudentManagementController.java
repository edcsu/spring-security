package com.example.springsecurity.Student;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENT_LIST = Arrays.asList(
            new Student(1, "John Doe"),
            new Student(2, "Jane Doe"),
            new Student(3, "Mohamed Salah"),
            new Student(4, "Lionel Messi"),
            new Student(5, "Wayne Rooney")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        return STUDENT_LIST;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return student;
    }

    @PutMapping(path = "{studentId}")
    public Student updateStudent(@PathVariable Integer studentId, @RequestBody Student student) {
        return student;
    }

    @DeleteMapping(path = "{studentId}")
    public Integer deleteStudent(@PathVariable Integer studentId) {
        return studentId;
    }
}
