package com.projetut.ptut.entity;

import jakarta.validation.constraints.Size;
import jakarta.persistence.*;

import java.util.Date;

public class Academique {

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
    @Column(name="Semestre")
    private String Semestre;

    @Basic
    @Column(name="Etablissement")
    private String Etablissement;

    @Basic
    @Column(name="Ville")
    private String Ville;

    @Basic
    @Column(name="Pays")
    private String Pays;

    @Basic
    @Column(name="Langue")
    private String Langue;

    @Basic
    @Column(name="Toeic")
    private Boolean Toeic;


    public Integer getNumINU() {
        return NumINU;
    }

    public String getIdPromo() {
        return IdPromo;
    }

    public String getSemestre() {
        return Semestre;
    }

    public String getEtablissement() {
        return Etablissement;
    }

    public String getVille() {
        return Ville;
    }

    public String getPays() {
        return Pays;
    }

    public String getLangue() {
        return Langue;
    }

    public Boolean getToeic() {
        return Toeic;
    }

    public void setNumINU(Integer numINU) {
        NumINU = numINU;
    }

    public void setIdPromo(String idPromo) {
        IdPromo = idPromo;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public void setEtablissement(String etablissement) {
        Etablissement = etablissement;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public void setPays(String pays) {
        Pays = pays;
    }

    public void setLangue(String langue) {
        Langue = langue;
    }

    public void setToeic(Boolean toeic) {
        Toeic = toeic;
    }

    @ManyToMany
    @JoinColumn(name = "IdPromo")
    private Promotion promotion;


}