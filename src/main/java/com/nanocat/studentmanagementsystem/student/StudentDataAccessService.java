package com.nanocat.studentmanagementsystem.student;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class StudentDataAccessService {

  private final JdbcTemplate jdbcTemplate;

  public StudentDataAccessService(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public List<Student> selectAllStudents() {
    String sql = "SELECT student_id, first_name, last_name, email, gender FROM student;";

    return jdbcTemplate.query(sql, getStudentRowMapper());
  }

  private RowMapper<Student> getStudentRowMapper() {
    return (resultSet, rowNum) -> {
      UUID studentId = UUID.fromString(resultSet.getString("student_id"));
      String firstName = resultSet.getString("first_name");
      String secondName = resultSet.getString("last_name");
      String email = resultSet.getString("email");
      Student.Gender gender = Student.Gender.valueOf(resultSet.getString("gender"));

      return new Student(
              studentId, firstName, secondName, email, gender
      );
    };
  }
}
