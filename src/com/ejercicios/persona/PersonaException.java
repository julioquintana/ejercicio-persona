package com.ejercicios.persona;

public class PersonaException extends Exception {
	double peso;
	double altura;
	
	PersonaException(String motivo, double peso, double altura){
		super(motivo);
		this.peso = peso;
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return this.getMessage()+" Peso: "+ getPeso() +" Altura: "+getAltura();
	}

}
