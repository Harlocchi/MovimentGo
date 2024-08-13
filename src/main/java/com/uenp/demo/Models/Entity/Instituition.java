package com.uenp.demo.Models.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "intituition")
public class Instituition {

    @Id
    private String id;
    private String name;
    private String city;
    private String phone;

    public Instituition(String id, String name, String city, String phone, User useResponsible) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phone = phone;

    }

    public Instituition() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
