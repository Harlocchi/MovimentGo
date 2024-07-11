package com.uenp.demo.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "students")
public class Student {

    @Id
    private String id;
    private String name;
    private String city;
    private Date birthday;
    private String gender;
    private Instituition intituition;
    private String classroom;

    public Student(String id, String name, String city, Date birthday, String gender, Instituition intituition, String classroom) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.birthday = birthday;
        this.gender = gender;
        this.intituition = intituition;
        this.classroom = classroom;
    }

    public Student() {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Instituition getIntituition() {
        return intituition;
    }

    public void setIntituition(Instituition intituition) {
        this.intituition = intituition;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
