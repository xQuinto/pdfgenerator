package com.example.pdfgenerator.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "opleiding", schema = "public")
@JsonIgnoreProperties({"persoon"})
public class Opleiding extends Ervaring{
    // TODO validation
    @Column(nullable = false)
    private String opleiding;

    @Column(nullable = false)
    private String school;

    @Column(nullable = false)
    private String niveau;

    @Column(nullable = false)
    private boolean diploma;

    public Opleiding(String beginJaar, String eindJaar, String titel, Long id, String opleiding, String school, String niveau, boolean diploma) {
        super(beginJaar, eindJaar, titel, id);
        this.opleiding = opleiding;
        this.school = school;
        this.niveau = niveau;
        this.diploma = diploma;
    }

    public Opleiding(String beginJaar, String eindJaar, String titel, String opleiding, String school, String niveau, boolean diploma) {
        super(beginJaar, eindJaar, titel);
        this.opleiding = opleiding;
        this.school = school;
        this.niveau = niveau;
        this.diploma = diploma;
    }

    public Opleiding(String opleiding, String school, String niveau, boolean diploma) {
        this.opleiding = opleiding;
        this.school = school;
        this.niveau = niveau;
        this.diploma = diploma;
    }

    public Opleiding() {
        super();
    }




    public String getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public boolean isDiploma() {
        return diploma;
    }

    public void setDiploma(boolean diploma) {
        this.diploma = diploma;
    }

    @Override
    public String toString() {
        return "Opleiding{" +
                "beginJaar='" + beginJaar + '\'' +
                ", eindJaar='" + eindJaar + '\'' +
                ", titel='" + titel + '\'' +
                ", opleiding='" + opleiding + '\'' +
                ", school='" + school + '\'' +
                ", niveau='" + niveau + '\'' +
                ", diploma=" + diploma +
                '}';
    }
}
