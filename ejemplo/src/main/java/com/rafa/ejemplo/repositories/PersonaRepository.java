package com.rafa.ejemplo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafa.ejemplo.model.Persona;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, String>{

}

