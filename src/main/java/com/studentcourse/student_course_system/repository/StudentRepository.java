package com.studentcourse.student_course_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studentcourse.student_course_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    boolean existsByEmail(String email);
}
