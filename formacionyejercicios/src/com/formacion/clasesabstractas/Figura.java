package com.formacion.clasesabstractas;

public abstract class Figura {
	
	private int numeroLados;
	
	public abstract float area();
	
	public abstract float perimetro();
	
	public void info() {
		System.out.println("hola");
	}
}
