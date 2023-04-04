package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.util.List;
@Entity
@Getter
@Setter
@NoArgsConstructor

public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String AnneeUniv;

    @OneToMany(mappedBy = "promotion")
    private List<Etudiant> etudiants;

//    @ManyToMany
//    @JoinColumn(name = "IdPromo")
//    private IngenieurHumaniste ingenieurHumaniste;
}