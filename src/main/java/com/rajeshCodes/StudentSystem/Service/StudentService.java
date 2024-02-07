package com.rajeshCodes.StudentSystem.Service;

import com.rajeshCodes.StudentSystem.Modal.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> findallStudent();

    void deleteById(int id);
}
