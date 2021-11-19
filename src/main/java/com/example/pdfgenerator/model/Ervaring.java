package com.example.pdfgenerator.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ervaring {
    // TODO ignore en toostring en user
    // TODO validation
    // TODO de tostrings opnieuw maken na complete models
    @Column(nullable = false)
    public String beginJaar;

    @Column(nullable = true)
    public String eindJaar;

    @Column(nullable = false)
    public String titel;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

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
                '}';
    }
}
