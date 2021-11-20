package com.example.pdfgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "werkervaring", schema = "public")
@JsonIgnoreProperties({"persoon"})
public class Werkervaring extends Ervaring {
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



}
