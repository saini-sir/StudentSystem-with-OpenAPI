package com.rajeshCodes.StudentSystem.Repository;

import com.rajeshCodes.StudentSystem.Modal.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
