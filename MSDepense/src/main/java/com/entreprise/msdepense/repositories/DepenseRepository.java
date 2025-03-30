package com.entreprise.msdepense.repositories;

import com.entreprise.msdepense.entities.Depense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepenseRepository extends JpaRepository<Depense,Long> {
}
