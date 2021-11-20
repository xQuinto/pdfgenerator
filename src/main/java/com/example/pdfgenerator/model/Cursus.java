package com.example.pdfgenerator.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "cursus", schema = "public")
@JsonIgnoreProperties({"persoon"})
public class Cursus extends Ervaring{



    @Column(nullable = false)
    private boolean certificaat;

    public boolean isCertificaat() {
        return certificaat;
    }

    public void setCertificaat(boolean certificaat) {
        this.certificaat = certificaat;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Persoon persoon;

    public Cursus() {

    }

    public Cursus(boolean certificaat, Persoon persoon) {
        this.certificaat = certificaat;
        this.persoon = persoon;
    }

    public Cursus(String beginJaar, String eindJaar, String titel, Long id, boolean certificaat, Persoon persoon) {
        super(beginJaar, eindJaar, titel, id);
        this.certificaat = certificaat;
        this.persoon = persoon;
    }

    public Cursus(String beginJaar, String eindJaar, String titel, boolean certificaat, Persoon persoon) {
        super(beginJaar, eindJaar, titel);
        this.certificaat = certificaat;
        this.persoon = persoon;
    }

    @Override
    public String toString() {
        return "Cursus{" +
                "certificaat=" + certificaat +
                ", persoon=" + persoon +
                ", beginJaar='" + beginJaar + '\'' +
                ", eindJaar='" + eindJaar + '\'' +
                ", titel='" + titel + '\'' +
                '}';
    }

}
