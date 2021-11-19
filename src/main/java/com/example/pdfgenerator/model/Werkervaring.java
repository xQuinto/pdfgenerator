package com.example.pdfgenerator.model;

import javax.persistence.Column;
import java.time.LocalDate;

public class Werkervaring extends Ervaring {
    // TODO de tostrings opnieuw maken na complete models
    // TODO  ignore en toostring
    // TODO validation
    @Column(nullable = false)
    public String werkgever;

    @Column(nullable = false)
    public String omschrijving;

    public Werkervaring(String beginJaar, String eindJaar, String titel, Long id, String werkgever, String omschrijving) {
        super(beginJaar, eindJaar, titel, id);
        this.werkgever = werkgever;
        this.omschrijving = omschrijving;
    }

    public Werkervaring(String beginJaar, String eindJaar, String titel, String werkgever, String omschrijving) {
        super(beginJaar, eindJaar, titel);
        this.werkgever = werkgever;
        this.omschrijving = omschrijving;
    }

    public Werkervaring(String werkgever, String omschrijving) {
        this.werkgever = werkgever;
        this.omschrijving = omschrijving;
    }

    public Werkervaring() {

    }

    public String getWerkgever() {
        return werkgever;
    }

    public void setWerkgever(String werkgever) {
        this.werkgever = werkgever;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Werkervaring{" +
                "beginJaar='" + beginJaar + '\'' +
                ", eindJaar='" + eindJaar + '\'' +
                ", titel='" + titel + '\'' +
                ", werkgever='" + werkgever + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }

    // many to one relationship with persoon
    // check ff de ignores etc in "user-project"


}
