package com.nanocat.studentmanagementsystem.student;

import java.util.UUID;

public class Student {
  private final UUID studentId;
  private final String firstName;
  private final String lastName;
  private final Gender gender;

  enum Gender {
    MALE, FEMALE
  }

  public Student(UUID studentId, String firstName, String lastName, Gender gender) {
    this.studentId = studentId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
  }

  public UUID getStudentId() {
    return studentId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Gender getGender() {
    return gender;
  }
}
