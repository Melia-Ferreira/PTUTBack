package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

public class Stage {

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

    @Basic
    @Column(name="Entreprise")
    private String Entreprise;

    @Basic
    @Column(name="Duree")
    private String Duree;

    @Basic
    @Column(name="Ville")
    private String Ville;

    @Basic
    @Column(name="Pays")
    private String Pays;

    @Basic
    @Column(name="Langue")
    private String Langue;

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

    public String getEntreprise() {
        return Entreprise;
    }

    public void setEntreprise(String entreprise) {
        Entreprise = entreprise;
    }

    public String getDuree() {
        return Duree;
    }

    public void setDuree(String duree) {
        Duree = duree;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String pays) {
        Pays = pays;
    }

    public String getLangue() {
        return Langue;
    }

    public void setLangue(String langue) {
        Langue = langue;
    }

    @OneToMany
    @JoinColumn(name = "IdPrommo")
    private Promotion promotion;
}

