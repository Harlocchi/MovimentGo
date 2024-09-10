package com.uenp.demo.Models.Entity;

import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "research_room")
public class ResearchRoom {

    @Id
    private String id;
    private String name;
    private Instituition instituition;
    private List<StudentMABCtest> studentsMABC;
    private LocalDate InicialDate;

    public ResearchRoom(String id, String name, Instituition instituition, List<StudentMABCtest> studentsMABC, LocalDate inicialDate) {
        this.id = id;
        this.name = name;
        this.instituition = instituition;
        this.studentsMABC = studentsMABC;
        InicialDate = inicialDate;
    }

    public ResearchRoom() {
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

    public Instituition getInstituition() {
        return instituition;
    }

    public void setInstituition(Instituition instituition) {
        this.instituition = instituition;
    }

    public List<StudentMABCtest> getStudentsMABC() {
        return studentsMABC;
    }

    public void setStudentsMABC(List<StudentMABCtest> studentsMABC) {
        this.studentsMABC = studentsMABC;
    }

    public LocalDate getInicialDate() {
        return InicialDate;
    }

    public void setInicialDate(LocalDate inicialDate) {
        InicialDate = inicialDate;
    }
}
