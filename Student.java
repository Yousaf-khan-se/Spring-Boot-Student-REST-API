package I228797.I228797_lab13.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Integer id;
    private String name;
    private Date dob;
    private float gpa;

    public Student() {
        super();
    }

    public Student(Integer id, String name, Date dob, float gpa) {
        super();
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gpa = gpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, dob=%s, grade=%s]", id, name, dob, gpa);
    }
}
