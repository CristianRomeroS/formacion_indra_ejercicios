package com.formacion.ejercicio3herencias;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private static char sexo;
	private double peso;
	private double altura;
	public Persona() {
		this.dni=generaDNI();
	}
	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo=sexo;
		this.dni=generaDNI();
		this.peso = 65;
		this.altura = 1.5;
		comprobarSexo(this.sexo);
	}
	public Persona(String nombre, int edad, String dni, double peso, double altura,char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
		this.sexo=sexo;
		comprobarSexo(this.sexo);
	}
	public Persona(String nombre, int edad, double peso, double altura,char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = generaDNI();
		this.peso = peso;
		this.altura = altura;
		this.sexo=sexo;
		comprobarSexo(this.sexo);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public static void setSexo(char sexo) {
		Persona.sexo = sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int calcularIMC() {
		double pesoIdeal;
		int retorno=-1;
		pesoIdeal=this.peso/(altura*altura);
		
		if(pesoIdeal>25) {
			retorno=1;
		}else if(pesoIdeal>=20&&pesoIdeal<=25) {
			retorno=0;
		}else {
			retorno=-1;
		}
		return retorno;
	}
	
	public boolean esMayorDeEdad() {
		boolean f=false;
		if(this.edad>=18) f=true;
		return f;
	}
	public void comprobarSexo(char sexo) {
		if(Character.compare(this.sexo, sexo)==0||Character.compare('M', sexo)==0) {
			this.sexo=sexo;
		}else {
			this.sexo='H';
		}
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", altura=" + altura
				+ " Sexo:"+ sexo+"]";
	}
	
	public String generaDNI() {
		char c = (char)(Math.random()*26 + 'A');
		int dni;
		String x="", dni2;
		for(int i=0;i<9;i++) {
			dni=(int)(Math.random()*9);
			x+=dni;
		}
		return this.dni=x+"-"+c;
	}
	
	
	
	
	
}
