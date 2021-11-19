package com.example.pdfgenerator.model;

import javax.persistence.Entity;

@Entity
public class Opleiding extends Ervaring{
    // TODO validation
    private String opleiding;
    private String school;
    private String niveau;
    private boolean diploma;
}
