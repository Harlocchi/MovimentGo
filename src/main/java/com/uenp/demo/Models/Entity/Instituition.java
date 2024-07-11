package com.uenp.demo.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "intituition")
public class Instituition {

    @Id
    private String id;
    private String name;


}
