package com.entreprise.msdepense.entities;

import com.entreprise.msdepense.entities.Enum.Categorie;
import com.entreprise.msdepense.entities.Enum.Indicateurfiscabilte;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor @NoArgsConstructor
@Data
@Entity
public class Depense {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime datedepense = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private Categorie categorie;

    private String description;
    private Float montant;
    private String device;
    private Float tauxchange;
    private Float montantconverti;
    private String nomfournisseur;
    private String commentaire;

    @Enumerated(EnumType.STRING)
    private Indicateurfiscabilte indicateurfiscabilte;
}
