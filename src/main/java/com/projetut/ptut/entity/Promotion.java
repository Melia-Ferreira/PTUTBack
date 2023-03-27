package com.projetut.ptut.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Promotion {

    @Id
    @Basic(optional = false)
    @Size(min = 4, max = 4)
    @Column(nullable = false, length = 4)
    private String IdPromo;

    @Column(nullable = false)
    private String AnneeUniv;

    @OneToMany(mappedBy = "Etudiant")
    private List<Etudiant> etudiants;
}