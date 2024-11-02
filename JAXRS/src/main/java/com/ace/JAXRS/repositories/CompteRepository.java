package com.ace.JAXRS.repositories;

import com.ace.JAXRS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
