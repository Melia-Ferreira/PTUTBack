package com.projetut.ptut.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.ManyToAny;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class FIE1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numINU;

    private String annee_univFIE1S1;
    private String etablissementFIE1S1;
    private String villeFIE1S1;
    private String paysFIE1S1;
    private String langueFIE1S1;
    private String annee_univFIE1S2;
    private String etablissementFIE1S2;
    private String villeFIE1S2;
    private String paysFIE1S2;
    private String langueFIE1S2;

}