package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Alternance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private String Entreprise;

    private String DureeContrat;
    private String Ville;

    private String Pays;

    private String Langue;

    private Boolean Toeic;

//    @ManyToMany
//    private Promotion promotion;

}