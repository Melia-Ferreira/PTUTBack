package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ManyToAny;

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

    @ManyToMany
    @JoinColumn(name = "IdPromo")
    private IngenieurHumaniste ingenieurHumaniste;
}