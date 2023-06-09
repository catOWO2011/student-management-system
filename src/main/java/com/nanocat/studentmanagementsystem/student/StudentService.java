package com.nanocat.studentmanagementsystem.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {
  private final StudentDataAccessService studentDataAccessService;

  public StudentService(StudentDataAccessService studentDataAccessService) {
    this.studentDataAccessService = studentDataAccessService;
  }

  List<Student> getAllStudents() {
    return studentDataAccessService.selectAllStudents();
  }

  void addNewStudent(Student student) {
    addNewStudent(null, student);
  }
  void addNewStudent(UUID studentId, Student student) {
    UUID newStudentId = Optional.ofNullable(studentId).orElse(UUID.randomUUID());
    // TODO: Verify that email is not taken
    studentDataAccessService.insertStudent(newStudentId, student);
  }

  void deleteStudent(UUID studentId) {
    studentDataAccessService.deleteStudent(studentId);
  }

  void updateStudent(UUID studentId, Student student) {
    studentDataAccessService.updateStudent(studentId, student);
  }
}
