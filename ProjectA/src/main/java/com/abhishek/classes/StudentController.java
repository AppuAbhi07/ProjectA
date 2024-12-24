package com.abhishek.classes;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return Arrays.asList(
                new Student(1L, "John Doe", "john.doe@example.com"),
                new Student(2L, "Jane Smith", "jane.smith@example.com")
        );
    }
}
