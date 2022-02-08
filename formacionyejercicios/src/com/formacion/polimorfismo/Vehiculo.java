package com.formacion.polimorfismo;

public class Vehiculo {
	String matricula;
	String marca;
	String modelo;
	private String codigoMotor="rojo";
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String mostrarDatos() {
		return "********Vehiculo********\n"+
				"Matricula: "+matricula+"\n"+
				"Marca: "+marca+"\n"+
				"Modelo: "+modelo+"\n";
	}
}
