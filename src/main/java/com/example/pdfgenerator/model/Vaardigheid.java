package com.example.pdfgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vaardigheid {

    private String vaardigheid;
    private String omschrijving;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
