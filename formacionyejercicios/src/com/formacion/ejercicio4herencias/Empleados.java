package com.formacion.ejercicio4herencias;

public abstract class Empleados {

	protected String nombre;
	protected int edad;
	protected double salario;
	protected static int PLUS=300;
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public abstract void plus() ;
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		return salario;
	}
	public static int getPLUS() {
		return PLUS;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public static void setPLUS(int pLUS) {
		PLUS = pLUS;
	}
	
		 
	

	
	
}
