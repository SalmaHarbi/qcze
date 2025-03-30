package com.entreprise.msdepense.repositories;

import com.entreprise.msdepense.entities.Justificatif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JustificatifRepository extends JpaRepository<Justificatif,Long> {
}
