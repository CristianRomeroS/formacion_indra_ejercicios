package com.formacion.herenciarepaso;

public class Persona {
 public String nombre;
 public String apellido;
 public int dni;
 public String nacionalidad;
 
 public Persona(String nombre, String apellido, int dni, String nacionalidad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.dni = dni;
	this.nacionalidad = nacionalidad;
}

public void info() {
	 System.out.print("nombre:"+nombre+"\n"+
			 			"apellido:"+apellido+"\n"+
			 			"dni:" +dni+"\n"+
			 			"nacionalidad:" +nacionalidad+"\n");
 }
 
}
