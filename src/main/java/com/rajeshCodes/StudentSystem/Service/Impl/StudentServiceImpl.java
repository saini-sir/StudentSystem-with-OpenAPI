package com.rajeshCodes.StudentSystem.Service.Impl;
import com.rajeshCodes.StudentSystem.Modal.Student;
import com.rajeshCodes.StudentSystem.Repository.StudentRepository;
import com.rajeshCodes.StudentSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> findallStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(int id) {
        studentRepository.deleteById(id);
    }
}
