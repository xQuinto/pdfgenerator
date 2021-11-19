package com.example.pdfgenerator.model;

import javax.persistence.*;

@Entity
public class Vaardigheid {
    // TODO de tostrings opnieuw maken na complete models
    // TODO ignore en relationships en set user
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String vaardigheid;

    @Column(nullable = false)
    private String omschrijving;

    public Vaardigheid(Long id, String vaardigheid, String omschrijving) {
        this.id = id;
        this.vaardigheid = vaardigheid;
        this.omschrijving = omschrijving;
    }

    public Vaardigheid(String vaardigheid, String omschrijving) {
        this.vaardigheid = vaardigheid;
        this.omschrijving = omschrijving;
    }

    public Vaardigheid() {

    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getVaardigheid() {
        return vaardigheid;
    }

    public void setVaardigheid(String vaardigheid) {
        this.vaardigheid = vaardigheid;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Vaardigheid{" +
                "id=" + id +
                ", vaardigheid='" + vaardigheid + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }
}
