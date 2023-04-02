package com.projetut.ptut.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

public class Alternance {

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
    @Column(name="DureeContrat")
    private String DureeContrat;
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

    public void setNumINU(Integer numINU) {
        NumINU = numINU;
    }

    public String getIdPromo() {
        return IdPromo;
    }

    public void setIdPromo(String idPromo) {
        IdPromo = idPromo;
    }

    public String getDureeContrat() {
        return DureeContrat;
    }

    public void setDureeContrat(String dureeContrat) {
        DureeContrat = dureeContrat;
    }

    public String getEntreprise() {
        return Entreprise;
    }

    public void setEntreprise(String entreprise) {
        Entreprise = entreprise;
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

    public Boolean getToeic() {
        return Toeic;
    }

    public void setToeic(Boolean toeic) {
        Toeic = toeic;
    }

    @ManyToMany
    @JoinColumn(name = "IdPromo")
    private Promotion promotion;

}