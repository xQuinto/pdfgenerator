package com.example.pdfgenerator.model;

import javax.persistence.*;

@Entity
public class Taal {
    // TODO de tostrings opnieuw maken na complete models
    // TODO ignore en toostring en user toevoegen met set en get
    // TODO validation
    // Hier enum van kunnen maken?

    @Column(nullable = false)
    private String taal;

    @Column(nullable = false)
    private String Spreken;

    @Column(nullable = false)
    private String schrijven;

    @Column(nullable = false)
    private String lezen;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Taal(String taal, String spreken, String schrijven, String lezen, Long id) {
        this.taal = taal;
        Spreken = spreken;
        this.schrijven = schrijven;
        this.lezen = lezen;
        this.id = id;
    }

    public Taal(String taal, String spreken, String schrijven, String lezen) {
        this.taal = taal;
        Spreken = spreken;
        this.schrijven = schrijven;
        this.lezen = lezen;
    }

    public Taal() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTaal() {
        return taal;
    }

    public void setTaal(String taal) {
        this.taal = taal;
    }

    public String getSpreken() {
        return Spreken;
    }

    public void setSpreken(String spreken) {
        Spreken = spreken;
    }

    public String getSchrijven() {
        return schrijven;
    }

    public void setSchrijven(String schrijven) {
        this.schrijven = schrijven;
    }

    public String getLezen() {
        return lezen;
    }

    public void setLezen(String lezen) {
        this.lezen = lezen;
    }

    @Override
    public String toString() {
        return "Taal{" +
                "taal='" + taal + '\'' +
                ", Spreken='" + Spreken + '\'' +
                ", schrijven='" + schrijven + '\'' +
                ", lezen='" + lezen + '\'' +
                ", id=" + id +
                '}';
    }
}
