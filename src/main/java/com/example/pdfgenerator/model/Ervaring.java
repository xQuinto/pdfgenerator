package com.example.pdfgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Ervaring {
    // TODO validation
    public String beginJaar;
    public String eindJaar;
    public String titel;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
