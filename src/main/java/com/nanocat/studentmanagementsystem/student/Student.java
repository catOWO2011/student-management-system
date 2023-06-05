package com.nanocat.studentmanagementsystem.student;

import java.util.UUID;

public class Student {
  private final UUID studentId;
  private final String firstName;
  private final String lastName;
  private final String email;
  private final Gender gender;
  private final String largePicture;

  enum Gender {
    MALE, FEMALE
  }

  public Student(UUID studentId, String firstName, String lastName, String email, Gender gender, String largePicture) {
    this.studentId = studentId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.largePicture = largePicture;
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

  public String getEmail() {
    return email;
  }

  public String getLargePicture() {
    return largePicture;
  }

  @Override
  public String toString() {
    return "Student{" +
            "studentId=" + studentId +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", gender=" + gender + '\'' +
            ", largePicture=" + largePicture + '\'' +
            '}';
  }
}
