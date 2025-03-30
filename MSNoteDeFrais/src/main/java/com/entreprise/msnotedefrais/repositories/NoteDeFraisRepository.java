package com.entreprise.msnotedefrais.repositories;

import com.entreprise.msnotedefrais.entities.NoteDeFrais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDeFraisRepository extends JpaRepository<NoteDeFrais,Long> {
}
