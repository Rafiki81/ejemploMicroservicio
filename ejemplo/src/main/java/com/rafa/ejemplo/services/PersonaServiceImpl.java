package com.rafa.ejemplo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafa.ejemplo.model.Persona;
import com.rafa.ejemplo.repositories.PersonaRepository;


@Service
public class PersonaServiceImpl implements PersonaSevice{
	
	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Persona crearPersona(Persona persona) {
		
		personaRepository.save(persona);
		
		return persona;
	}

	@Override
	public Persona obtenerPersonaPorId(String dni) {
		
		return personaRepository.findById(dni).orElse(null);
	}

}
