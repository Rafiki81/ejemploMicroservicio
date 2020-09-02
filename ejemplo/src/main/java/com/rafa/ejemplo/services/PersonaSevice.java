package com.rafa.ejemplo.services;

import com.rafa.ejemplo.model.Persona;

public interface PersonaSevice {
	
	public Persona crearPersona(Persona persona);
	
	public Persona obtenerPersonaPorId(String dni);

}
