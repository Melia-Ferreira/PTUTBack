package com.projetut.ptut.dao;

import com.projetut.ptut.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EtudiantRepository extends JpaRepository<Etudiant, String> {

    /**
     * Recherche le nom d'un étudiant par son numINU (unique)
     * @param nom le nom recherché
     * @return Le nom et prénom de l'étudiant correspondant au numINU

    Etudiant findByNumINU(String numINU);

     */
}