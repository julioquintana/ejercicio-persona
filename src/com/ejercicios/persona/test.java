package com.ejercicios.persona;

public class test {

	public static void main(String[] args) throws PersonaException {
		// TODO Auto-generated method stub

		Persona p1 = new Persona();
		p1.setNombre("Julio QUintana");
		p1.setEdad(36);
		p1.setAltura(1.7);
		p1.setPeso(118.5);
		System.out.println(p1);
		
		Persona p2 = new Persona("David Escudero",23,'G', 80.75,1.8);
		
		System.out.println(p2);
	}

}
