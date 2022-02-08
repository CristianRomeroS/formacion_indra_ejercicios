package com.formacion.polimorfismo;

public class VehiculoDeportivo extends Vehiculo{
	public int cilindrada;
	public VehiculoDeportivo(String matricula, String marca, String modelo,int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada=cilindrada;
	}
	
	public String mostrarDatos() {
		
		return "********Deportivo********\n"+
				"Matricula: "+matricula+"\n"+
				"Marca: "+marca+"\n"+
				"Modelo: "+modelo+"\n"+
				"Cilindrada:"+cilindrada;
	}
	

}
