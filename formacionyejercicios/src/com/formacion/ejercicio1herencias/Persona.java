package com.formacion.ejercicio1herencias;

public class Persona {
	String nombre;
	String apellidos;
	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	@Override
	public String toString() {
		return apellidos+" "+nombre;
	}
	
}
