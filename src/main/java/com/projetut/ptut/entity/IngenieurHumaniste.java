package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

public class IngenieurHumaniste {

    @Id
    @Basic(optional = false)
    @Size(min = 8, max = 8)
    @Column(nullable = false, length = 8)
    private Integer NumINU;

    @Id
    @Basic(optional = false)
    @Size(min = 5)
    @Column(nullable = false)
    private int IdAction;

    @Id
    @Basic(optional = false)
    @Size(min = 4, max = 4)
    @Column(nullable = false, length = 4)
    private String IdPromo;

    @Basic
    @Column(name="Intitule")
    private String Intitule;


    @Basic
    @Column(name="Description")
    private String Description;

    public Integer getNumINU() {
        return NumINU;
    }

    public void setNumINU(Integer numINU) {
        NumINU = numINU;
    }

    public int getIdAction() {
        return IdAction;
    }

    public void setIdAction(int idAction) {
        IdAction = idAction;
    }

    public String getIntitule() {
        return Intitule;
    }

    public void setIntitule(String intitule) {
        Intitule = intitule;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getIdPromo() {
        return IdPromo;
    }

    public void setIdPromo(String idPromo) {
        IdPromo = idPromo;
    }


    @ManyToMany
    @JoinColumn(name = "IdPromo")
    private Promotion promotion;
}