package com.ejercicios.persona;

public interface Personas {
	public int getIMM() throws PersonaException ;
	boolean esMayorDeEdad();
	char comprobarSexo(char sexo);
	int generaDNI();
	
	
}
