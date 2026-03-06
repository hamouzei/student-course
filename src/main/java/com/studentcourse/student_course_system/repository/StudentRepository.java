package com.studentcourse.student_course_system.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.studentcourse.student_course_system.entity.student;

public interface StudentRepository extends JpaRepository<student, Long>{
}
