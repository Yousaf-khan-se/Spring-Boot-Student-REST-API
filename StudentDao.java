package I228797.I228797_lab13.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import I228797.I228797_lab13.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer>{

}
