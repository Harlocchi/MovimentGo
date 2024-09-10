package com.uenp.demo.Models.Entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

@Data
@Document(collection = "studentMABCtest")
public class StudentMABCtest extends Student {

    @Id
    private String Id;
    private MABCtest mabctest;
    private LocalDate testInit;


    public StudentMABCtest(String name, String city, LocalDate birthday, String gender, String intituitionId, String classroom, String id, MABCtest mabctest) {
        super(name, city, birthday, gender, intituitionId, classroom);
        Id = id;
        this.mabctest = mabctest;
    }

    public StudentMABCtest() {
    }


    public int getScoregetTurningPegsPrefHandTimeByAge(int AgeMonths){
        int mesesIdade = getAgeInMonths(testInit);
        int score = mabctest.getTurningPegsPrefHandTime();
        //entre 3 e 3:5 anos
        if(mesesIdade >=36 && mesesIdade  <= 41){

        }
    }



}
