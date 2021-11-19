package com.example.pdfgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Referentie {
    // if referentie.isEmpty, dan dit ook niet weergeven op pdf.
    // dus eerst die check vooraf doen.

    private String naam;
    private String titel;
    private String bedrijfsnaam;
    private String telefoon;
    private String email;
    private String relatie;
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
