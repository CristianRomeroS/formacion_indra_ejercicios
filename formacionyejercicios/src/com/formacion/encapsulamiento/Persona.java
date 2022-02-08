package com.formacion.encapsulamiento;

public class Persona {
	private int edad;
	//setter asignar/enviar
	public void setEdad(int edad) {
		if(edad<=100&&edad>=0) this.edad=edad;
	}
	//getter coger/capturar
	public int getEdad() {
		return this.edad;
	}
}
