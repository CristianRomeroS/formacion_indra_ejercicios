package com.formacion.ejercicio4herencias;

public class Comercial extends Empleados{
	public double comision;
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision=comision;
		// TODO Auto-generated constructor stub
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	
	@Override
	public void plus() {
		if(this.edad>30 && comision>200) {
			this.salario+=this.PLUS;
		}
	}
	@Override
	public String toString() {
		return "Comercial [comision=" + comision + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}
	
	
}
