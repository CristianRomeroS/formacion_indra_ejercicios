package com.formacion.interfaces;

public class Perro extends Canino implements Animal, Mascota{

	public Perro(String raza, String tipo, String tamaño) {
		super(raza, tipo, tamaño);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String comunicacion() {
		// TODO Auto-generated method stub
		return "Ladra";
	}

	@Override
	public String alimentacion() {
		// TODO Auto-generated method stub
		return "carne y pollo";
	}

	@Override
	public String transporte() {
		// TODO Auto-generated method stub
		return "4 patas";
	}

	@Override
	public String nombre() {
		// TODO Auto-generated method stub
		return "pupi";
	}

	@Override
	public String dueño() {
		// TODO Auto-generated method stub
		return "cristian";
	}

}
