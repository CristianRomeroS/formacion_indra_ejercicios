package com.formacion.polimorfismo;

public class VehiculoTurismo extends Vehiculo {
	
	public int numeroDePuertas;
	public VehiculoTurismo(String matricula, String marca, String modelo,int numeroDePuertas) {
		super(matricula, marca, modelo);
		this.numeroDePuertas=numeroDePuertas;
	}
	@Override
	public String mostrarDatos() {
		return "********Turismo********\n"+
				"Matricula: "+matricula+"\n"+
				"Marca: "+marca+"\n"+
				"Modelo: "+modelo+"\n"+
				"Numero de puertas:"+numeroDePuertas;
	}
	
	
	
	
	
}
