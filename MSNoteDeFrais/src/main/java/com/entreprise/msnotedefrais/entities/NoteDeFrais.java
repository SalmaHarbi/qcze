package com.entreprise.msnotedefrais.entities;

import com.entreprise.msnotedefrais.entities.Enum.Statut;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor @NoArgsConstructor
@Data
@Entity
public class NoteDeFrais {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate datesoumission;

    private String motifnotefrais;

    @Enumerated(EnumType.STRING)
    private Statut statut;

    private String commentaire;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dateapprobationrejet;

    private String raisondurejet;
    private Float montanttotal;

}
