package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class Etudiant {

    @Id
    @Basic(optional = false)
    @Size(min = 8, max = 8)
    @Column(nullable = false, length = 8)
    private Integer NumINU;

    @Basic(optional = false)
    @Size(max = 25)
    @Column(length = 25)
    private String Nom;

    @Basic(optional = false)
    @Size(max = 25)
    @Column(length = 25)
    private String Prenom;

    @Column(nullable = false)
    private Date DateNaiss;

    @Column(nullable = false)
    private String Adresse;

    @ManyToOne
    @JoinColumn(name = "idPromo")
    private Promotion promotion;
}
