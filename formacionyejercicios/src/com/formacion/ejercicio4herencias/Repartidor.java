package com.formacion.ejercicio4herencias;

public class Repartidor extends Empleados {
	public String zona;
	public Repartidor(String nombre, int edad, double salario,String zona) {
		super(nombre, edad, salario);
		this.zona=zona;
		// TODO Auto-generated constructor stub
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	@Override
	public void plus() {
		if(this.edad<25 &&this.zona.equals("Zona 3")) {
			this.salario+=this.PLUS;
		}
	}
	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	
	
	

}
