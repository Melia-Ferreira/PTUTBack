package com.projetut.ptut.entity;

import jakarta.validation.constraints.Size;
import java.util.List;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Academique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Semestre;
    private String Etablissement;
    private String Ville;
    private String Pays;
    private String Langue;
    private Boolean Toeic;

    @ManyToMany
    private List<Promotion> promotions;


}