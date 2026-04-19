package I228797.I228797_lab13.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import I228797.I228797_lab13.entity.Student;
import I228797.I228797_lab13.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/students")
    public List<Student> retrieveAllStudents() {
        return service.findAll();
    }

    @GetMapping("/students/{id}")
    public Student retrieveStudent(@PathVariable int id) {
        return service.findOne(id);
    }

    // Method to create a new student detail   
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return service.save(student);
    }

    // Method to delete a student resource  
    // if the student deleted successfully it returns status 200 OK otherwise 404 Not Found  
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.deleteById(id);
    }

    // Method to update an existing student
    @PutMapping("/students/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable int id) {
        Student existingStudent = service.findOne(id);
        if (existingStudent == null) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        student.setId(id); // Ensure the ID in the request body matches the path variable
        return service.updateStudent(student);
    }
}
