package com.ejercicios.persona;

public class Persona implements Personas {
	private String nombre;
	private int edad;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;
	
	Persona(){
		this.nombre="";
		this.edad=0;
		this.dni= generaDNI();
		this.sexo='M';
		this.peso=0;
		this.altura=0;
	}
	Persona(String nombre,int edad, char sexo, double peso, double altura){
		this.nombre=nombre;
		this.edad=edad;
		this.dni= generaDNI();
		this.sexo=comprobarSexo(sexo);
		this.peso=peso;
		this.altura=altura;
	}
	@Override
	public char comprobarSexo(char sexo) {
		if(sexo == 'M' || sexo == 'F') {
			return sexo;
		}else {
			return 'M';
		}
	}
	@Override 
	public int getIMM() throws PersonaException {
		
		double iMM;

		iMM = this.peso/(this.altura*this.altura);
		if (iMM > 0) {
			throw new PersonaException("Falta valores para calcular",peso,altura);
		}
		if (iMM < 20) {
				return -1;
			}else if(iMM >= 20 && iMM <= 25){
				return 0;
			}else{
				return 1;
			}
		
	}
	
	@Override
	public boolean esMayorDeEdad() {
		if(getEdad() >=18) {
			return true;
		}else {
			return false;
		}
	}


	@Override
	public int generaDNI() {
		// TODO Auto-generated method stub
		return (int)(100000000 * Math.random());
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = comprobarSexo(sexo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) throws PersonaException {
		if (peso > 0) {
			this.peso = peso;
		}else {
			throw new PersonaException("El peso no puede ser negativo",getPeso(),getAltura());
		}
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) throws PersonaException {
		if (altura > 0) {
			this.altura = altura;
		}else {
			throw new PersonaException("El peso no puede ser negativo",getPeso(),getAltura());
		}

		this.altura = altura;
	}

	public String toString() {
		try {
			return "Nobre:"+ getNombre() +" Edad:"+ getEdad() +" DNI:"+ getDni() +" Sexo:"+ getSexo() +" Peso:"+ getPeso() +" Altura:"+ getAltura() +" IMM:"+getIMM();
		} catch (PersonaException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}  
		return "";
	}
	

}
