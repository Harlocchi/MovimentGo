package com.uenp.demo.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentMABCtest")
public class StudentMABCtest {

    @Id
    private String Id;
    private Student student;
    private MABCtest mabctest;


    public StudentMABCtest(Student student, MABCtest mabctest) {
        this.student = student;
        this.mabctest = mabctest;
    }

    public StudentMABCtest() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public MABCtest getMabctest() {
        return mabctest;
    }

    public void setMabctest(MABCtest mabctest) {
        this.mabctest = mabctest;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
