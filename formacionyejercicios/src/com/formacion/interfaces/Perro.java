package com.formacion.interfaces;

public class Perro extends Canino implements Animal, Mascota{

	public Perro(String raza, String tipo, String tama�o) {
		super(raza, tipo, tama�o);
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
	public String due�o() {
		// TODO Auto-generated method stub
		return "cristian";
	}

}
