package com.example.pdfgenerator.model;

import java.time.LocalDate;

public class Werkervaring extends Ervaring {
    // TODO validation
    public String werkgever;
    public String omschrijving;

    // many to one relationship with persoon
    // check ff de ignores etc in "user-project"
}
