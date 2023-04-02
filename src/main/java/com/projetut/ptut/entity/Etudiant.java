package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;

public class Etudiant {

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

    @Basic(optional = false)
    @Size(max = 25)
    @Column(length = 25)
    private String Nom;

    @Basic(optional = false)
    @Size(max = 25)
    @Column(length = 25)
    private String Prenom;

    @Basic
    @Column(name="DateNaiss")
    private String DateNaiss;


    @Basic
    @Column(name="Adresse")
    private String Adresse;


    public Integer getNumINU() {
        return NumINU;
    }

    public void setNumINU(Integer numINU) {
        NumINU = numINU;
    }

    public String getIdPromo() {
        return IdPromo;
    }

    public void setIdPromo(String idPromo) {
        IdPromo = idPromo;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(String dateNaiss) {
        DateNaiss = dateNaiss;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Alternance getAlternance() {
        return alternance;
    }

    public void setAlternance(Alternance alternance) {
        this.alternance = alternance;
    }

    public IngenieurHumaniste getIngenieurHumaniste() {
        return ingenieurHumaniste;
    }

    public void setIngenieurHumaniste(IngenieurHumaniste ingenieurHumaniste) {
        this.ingenieurHumaniste = ingenieurHumaniste;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @ManyToOne
    @JoinColumn(name = "IdPromo")
    private Promotion promotion;

    @ManyToOne
    @JoinColumn(name = "NumINU")
    private Academique academique;

    @ManyToOne
    @JoinColumn(name = "NumINU")
    private Alternance alternance;

    @ManyToMany
    @JoinColumn(name = "NumINU")
    private IngenieurHumaniste ingenieurHumaniste;

    @ManyToOne
    @JoinColumn(name = "NumINU")
    private Stage stage;

    // ca me soule test
}
