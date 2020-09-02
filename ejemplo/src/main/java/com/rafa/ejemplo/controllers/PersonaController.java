package com.rafa.ejemplo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafa.ejemplo.model.Persona;
import com.rafa.ejemplo.services.PersonaSevice;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	PersonaSevice personaService;
	
	@GetMapping("/{dni}")
	public Persona getPersona(@PathVariable String dni) {
		
		return personaService.obtenerPersonaPorId(dni);
		
	}
	
	@PostMapping
	public Persona PostPersona(@RequestBody Persona persona) {
		
		personaService.crearPersona(persona);
		
		return persona;	
	}

}
