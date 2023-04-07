package com.projetut.ptut.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;

@Entity
@Getter @Setter @NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Nom;

    private String Prenom;

    private String DateNaiss;
    private String Adresse;

    @ManyToOne
    private Promotion promotion;

    @ManyToOne
    private Academique academique;

    @ManyToOne
    private Alternance alternance;

    @ManyToMany
    private List<IngenieurHumaniste> ingenieurHumaniste;

    @ManyToOne
    private Stage stage;

    @ManyToOne
    private FIE1 fie1;
}
