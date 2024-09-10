package com.uenp.demo.Models.Entity;


import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;


@Data
public class Student {


    private String name;
    private String city;
    private LocalDate birthday;
    private String gender;
    private String intituitionId;
    private String classroom;


    public Student(String name, String city, LocalDate birthday, String gender, String intituitionId, String classroom) {
        this.name = name;
        this.city = city;
        this.birthday = birthday;
        this.gender = gender;
        this.intituitionId = intituitionId;
        this.classroom = classroom;
    }

    public Student() {
    }

    public int getAgeInMonths(LocalDate init){
        Period period = Period.between(birthday, init);
        return period.getYears() * 12 + period.getMonths();
    }


}
