package com.uenp.demo.Models.Entity;


import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Data
public class Student {

    @Id
    private String id;
    private String name;
    private String city;
    private Date birthday;
    private String gender;
    private String intituitionId;
    private String classroom;

    public Student(String id, String name, String city, Date birthday, String gender, String intituitionId, String classroom) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.birthday = birthday;
        this.gender = gender;
        this.intituitionId = intituitionId;
        this.classroom = classroom;
    }

    public Student() {
    }


}
