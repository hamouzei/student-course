package com.studentcourse.student_course_system.service;
import com.studentcourse.student_course_system.entity.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);
}
