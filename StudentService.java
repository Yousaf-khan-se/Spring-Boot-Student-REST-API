package I228797.I228797_lab13.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import I228797.I228797_lab13.entity.Student;
import I228797.I228797_lab13.dao.StudentDao;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    // Method to retrieve all Students from the list  
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    // Method to add the Student in the list   
    public Student save(Student student) {
        return studentDao.save(student);
    }

    // Method to find a particular Student from the list  
    public Student findOne(int id) {
        return studentDao.findById(id).orElse(null);
    }

    // Method to delete a Student resource
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }

    // Method to update an existing Student
    public Student updateStudent(Student updatedStudent) {
        return studentDao.save(updatedStudent);
    }
}
