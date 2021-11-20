package com.example.pdfgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "taal", schema = "public")
@JsonIgnoreProperties({"persoon"})
public class Taal {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "persoon_id")
    private Persoon persoon;

    public Persoon getPersoon() {
        return persoon;
    }

    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    public Taal(String taal, String spreken, String schrijven, String lezen, Long id, Persoon persoon) {
        this.taal = taal;
        Spreken = spreken;
        this.schrijven = schrijven;
        this.lezen = lezen;
        this.id = id;
        this.persoon = persoon;
    }

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
                ", persoon=" + persoon +
                '}';
    }
}
