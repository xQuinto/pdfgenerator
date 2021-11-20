package com.example.pdfgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "vaardigheid", schema = "public")
@JsonIgnoreProperties({"persoon"})
public class Vaardigheid {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String vaardigheid;

    @Column(nullable = false)
    private String omschrijving;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "persoon_id")
    private Persoon persoon;

    public Persoon getPersoon() {
        return persoon;
    }

    public Vaardigheid(Long id, String vaardigheid, String omschrijving, Persoon persoon) {
        this.id = id;
        this.vaardigheid = vaardigheid;
        this.omschrijving = omschrijving;
        this.persoon = persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

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
                ", persoon=" + persoon +
                '}';
    }
}
