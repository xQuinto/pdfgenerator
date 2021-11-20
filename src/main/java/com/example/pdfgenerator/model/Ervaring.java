package com.example.pdfgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@JsonIgnoreProperties({"persoon"})
public class Ervaring {
    // TODO validation
    @Column(nullable = false)
    public String beginJaar;

    @Column(nullable = true)
    public String eindJaar;

    @Column(nullable = false)
    public String titel;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "persoon_id")
    private Persoon persoon;

    public Ervaring(String beginJaar, String eindJaar, String titel, Long id) {
        this.beginJaar = beginJaar;
        this.eindJaar = eindJaar;
        this.titel = titel;
        this.id = id;
    }

    public Ervaring(String beginJaar, String eindJaar, String titel) {
        this.beginJaar = beginJaar;
        this.eindJaar = eindJaar;
        this.titel = titel;
    }

    public Ervaring() {

    }

    public Ervaring(String beginJaar, String eindJaar, String titel, Long id, Persoon persoon) {
        this.beginJaar = beginJaar;
        this.eindJaar = eindJaar;
        this.titel = titel;
        this.id = id;
        this.persoon = persoon;
    }

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getBeginJaar() {
        return beginJaar;
    }

    public void setBeginJaar(String beginJaar) {
        this.beginJaar = beginJaar;
    }

    public String getEindJaar() {
        return eindJaar;
    }

    public void setEindJaar(String eindJaar) {
        this.eindJaar = eindJaar;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "Ervaring{" +
                "beginJaar='" + beginJaar + '\'' +
                ", eindJaar='" + eindJaar + '\'' +
                ", titel='" + titel + '\'' +
                ", id=" + id +
                ", persoon=" + persoon +
                '}';
    }
}
