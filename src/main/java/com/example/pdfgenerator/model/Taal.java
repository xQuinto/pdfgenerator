package com.example.pdfgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Taal {
    // TODO validation
    // Hier enum van kunnen maken?
    private String taal;
    private String Spreken;
    private String schrijven;
    private String lezen;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
