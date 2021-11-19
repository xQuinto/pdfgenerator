package com.example.pdfgenerator.model;

import javax.persistence.*;

@Entity
public class Referentie {
    // TODO de tostrings opnieuw maken na complete models
    // TODO ignore en toostring en user
    // if referentie.isEmpty, dan dit ook niet weergeven op pdf.
    // dus eerst die check vooraf doen.

    @Column(nullable = false)
    private String naam;

    @Column(nullable = false)
    private String titel;

    @Column(nullable = false)
    private String bedrijfsnaam;

    @Column(nullable = true)
    private String telefoon;

    @Column(nullable = true)
    private String email;

    @Column(nullable = false)
    private String relatie;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Referentie(String naam, String titel, String bedrijfsnaam, String telefoon, String email, String relatie, Long id) {
        this.naam = naam;
        this.titel = titel;
        this.bedrijfsnaam = bedrijfsnaam;
        this.telefoon = telefoon;
        this.email = email;
        this.relatie = relatie;
        this.id = id;
    }

    public Referentie(String naam, String titel, String bedrijfsnaam, String telefoon, String email, String relatie) {
        this.naam = naam;
        this.titel = titel;
        this.bedrijfsnaam = bedrijfsnaam;
        this.telefoon = telefoon;
        this.email = email;
        this.relatie = relatie;
    }

    public Referentie() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRelatie() {
        return relatie;
    }

    public void setRelatie(String relatie) {
        this.relatie = relatie;
    }

    @Override
    public String toString() {
        return "Referentie{" +
                "naam='" + naam + '\'' +
                ", titel='" + titel + '\'' +
                ", bedrijfsnaam='" + bedrijfsnaam + '\'' +
                ", telefoon='" + telefoon + '\'' +
                ", email='" + email + '\'' +
                ", relatie='" + relatie + '\'' +
                ", id=" + id +
                '}';
    }
}
