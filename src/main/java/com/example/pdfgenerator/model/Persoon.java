package com.example.pdfgenerator.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "persoon", schema = "public")
public class Persoon {
    // TODO validation
    @Column(nullable = false)
    private String voorletters;

    @Column(nullable = false)
    private String voornaam;

    @Column(nullable = true)
    private String tussenvoegsel;

    @Column(nullable = false)
    private String achternaam;

    @Column(nullable = false)
    private String woonplaats;

    @Column(nullable = false)
    private LocalDate dob;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefoonnummer;

    @Column(nullable = true)
    private String linkedInUrl;

    @Column(nullable = false)
    private String nationaliteit;

    @Column(nullable = false)
    private boolean rijbewijs;

    @Column(nullable = true)
    private String hobbys;

    @Column(nullable = true)
    private String interesses;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "persoon", cascade = CascadeType.ALL)
    private Set<Cursus> cursus = new HashSet<>();

    @OneToMany(mappedBy = "persoon", cascade = CascadeType.ALL)
    private Set<Opleiding> opleiding = new HashSet<>();

    @OneToMany(mappedBy = "persoon", cascade = CascadeType.ALL)
    private Set<Referentie> referentie = new HashSet<>();

    @OneToMany(mappedBy = "persoon", cascade = CascadeType.ALL)
    private Set<Taal> taal = new HashSet<>();

    @OneToMany(mappedBy = "persoon", cascade = CascadeType.ALL)
    private Set<Vaardigheid> vaardigheid = new HashSet<>();

    @OneToMany(mappedBy = "persoon", cascade = CascadeType.ALL)
    private Set<Werkervaring> werkervaring = new HashSet<>();

    public Persoon(String voorletters, String voornaam, String tussenvoegsel, String achternaam, String woonplaats, LocalDate dob,
                   String email, String telefoonnummer, String linkedInUrl, String nationaliteit, boolean rijbewijs, String hobbys,
                   String interesses, Long id) {
        this.voorletters = voorletters;
        this.voornaam = voornaam;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.woonplaats = woonplaats;
        this.dob = dob;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.linkedInUrl = linkedInUrl;
        this.nationaliteit = nationaliteit;
        this.rijbewijs = rijbewijs;
        this.hobbys = hobbys;
        this.interesses = interesses;
        this.id = id;
    }

    public Persoon(String voorletters, String voornaam, String tussenvoegsel, String achternaam, String woonplaats, LocalDate dob,
                   String email, String telefoonnummer, String linkedInUrl, String nationaliteit, boolean rijbewijs, String hobbys,
                   String interesses) {
        this.voorletters = voorletters;
        this.voornaam = voornaam;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.woonplaats = woonplaats;
        this.dob = dob;
        this.email = email;
        this.telefoonnummer = telefoonnummer;
        this.linkedInUrl = linkedInUrl;
        this.nationaliteit = nationaliteit;
        this.rijbewijs = rijbewijs;
        this.hobbys = hobbys;
        this.interesses = interesses;
    }

    public Persoon() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }


    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getNationaliteit() {
        return nationaliteit;
    }

    public void setNationaliteit(String nationaliteit) {
        this.nationaliteit = nationaliteit;
    }

    public boolean isRijbewijs() {
        return rijbewijs;
    }

    public void setRijbewijs(boolean rijbewijs) {
        this.rijbewijs = rijbewijs;
    }

    public String getHobbys() {
        return hobbys;
    }

    public void setHobbys(String hobbys) {
        this.hobbys = hobbys;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public Set<Cursus> getCursus() {
        return cursus;
    }

    public void setCursus(Set<Cursus> cursus) {
        this.cursus = cursus;
    }

    public Set<Opleiding> getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(Set<Opleiding> opleiding) {
        this.opleiding = opleiding;
    }

    public Set<Referentie> getReferentie() {
        return referentie;
    }

    public void setReferentie(Set<Referentie> referentie) {
        this.referentie = referentie;
    }

    public Set<Taal> getTaal() {
        return taal;
    }

    public void setTaal(Set<Taal> taal) {
        this.taal = taal;
    }

    public Set<Vaardigheid> getVaardigheid() {
        return vaardigheid;
    }

    public void setVaardigheid(Set<Vaardigheid> vaardigheid) {
        this.vaardigheid = vaardigheid;
    }

    public Set<Werkervaring> getWerkervaring() {
        return werkervaring;
    }

    public void setWerkervaring(Set<Werkervaring> werkervaring) {
        this.werkervaring = werkervaring;
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "voorletters='" + voorletters + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", tussenvoegsel='" + tussenvoegsel + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", woonplaats='" + woonplaats + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", telefoonnummer='" + telefoonnummer + '\'' +
                ", linkedInUrl='" + linkedInUrl + '\'' +
                ", nationaliteit='" + nationaliteit + '\'' +
                ", rijbewijs=" + rijbewijs +
                ", hobbys='" + hobbys + '\'' +
                ", interesses='" + interesses + '\'' +
                ", id=" + id +
                ", cursus=" + cursus +
                ", opleiding=" + opleiding +
                ", referentie=" + referentie +
                ", taal=" + taal +
                ", vaardigheid=" + vaardigheid +
                ", werkervaring=" + werkervaring +
                '}';
    }
}
