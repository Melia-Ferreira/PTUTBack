package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

public class Alternance {

    @Id
    @Basic(optional = false)
    @Size(min = 8, max = 8)
    @Column(nullable = false, length = 8)
    private Integer NumINU;

    @Id
    @Basic(optional = false)
    @Size(min = 4, max = 4)
    @Column(nullable = false, length = 4)
    private String IdPromo;

    @Column(nullable = false)
    private String Entreprise;

    @Column(nullable = false)
    private int DureeContrat;

    @Column(nullable = false)
    private String Ville;

    @Column(nullable = false)
    private String Pays;

    @Column(nullable = false)
    private String Langue;

    @Column(nullable = false)
    private Boolean Toeic;
}