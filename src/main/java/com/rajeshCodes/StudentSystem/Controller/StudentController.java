package com.rajeshCodes.StudentSystem.Controller;

import com.rajeshCodes.StudentSystem.Modal.Student;
import com.rajeshCodes.StudentSystem.Service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/student")
@Tag(name = "StudentController" , description =  "To perform operations on students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Operation(
            summary = "POST operations of students",
            description = "It is used to  save student object in database "
    )
    @PostMapping ("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New Student is added";
    }

    @Operation(
            summary = "GET operations of students",
            description = "It is used to  retrieve student object from database "
    )
    @GetMapping("/all")
    public List<Student> findStudent(){
        return studentService.findallStudent();
    }
    // http://localhost:8080/student?id=1

    @Operation(
            summary = "GET operations of students by using student id",
            description = "It is used to  retrieve student object from database  using student id"
    )
    @GetMapping("/{id}")
    public ResponseEntity<?> deleteById(@RequestParam int id){
        studentService.deleteById(id);
return  new ResponseEntity<>("Data deleted", HttpStatus.OK);
    }
//    @Operation(
//            summary = "PUT operations of students by using student id",
//            description = "It is used to  update student object in database  using student id"
//    )

}
