package com.formacion.polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{
	public int carga;
	public VehiculoFurgoneta(String matricula, String marca, String modelo,int carga) {
		super(matricula, marca, modelo);
		this.carga=carga;
	}

	public String mostrarDatos() {
		return "********Furgoneta********\n"+
				"Matricula: "+matricula+"\n"+
				"Marca: "+marca+"\n"+
				"Modelo: "+modelo+"\n"+
				"Carga:"+carga;
	}
	


}
