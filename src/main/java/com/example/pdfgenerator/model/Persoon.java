package com.example.pdfgenerator.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Persoon {
    // TODO validation
    private String voorletters;
    private String Voornaam;
    private String tussenvoegsel;
    private String achternaam;
    private String woonplaats;
    private LocalDate dob;
    private String email;
    private String telefoonnummer;
    private String linkedInUrl;
    private String nationaliteit;
    private boolean rijbewijs;

    private String hobbys;
    private String interesses;

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
