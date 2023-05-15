package com.nanocat.studentmanagementsystem.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class StudentController {
  @GetMapping("/students")
  public List<Student> getAllStudents() {
    return List.of(
            new Student(
                    UUID.randomUUID(),
                    "James",
                    "Bond",
                    "jamesbond@gmai.com",
                    Student.Gender.MALE),
            new Student(
                    UUID.randomUUID(),
                    "Elisa",
                    "Tamara",
                    "elisaTamara@gmail.com",
                    Student.Gender.FEMALE
            )
    );
  }
}
