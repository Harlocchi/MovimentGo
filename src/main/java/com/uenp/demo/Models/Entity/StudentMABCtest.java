package com.uenp.demo.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "studentMABCtest")
public class StudentMABCtest {

    @Id
    private String Id;
    private String studentId;
    private MABCtest mabctest;


    public StudentMABCtest(String student, MABCtest mabctest) {
        this.studentId = student;
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public MABCtest getMabctest() {
        return mabctest;
    }

    public void setMabctest(MABCtest mabctest) {
        this.mabctest = mabctest;
    }
}
