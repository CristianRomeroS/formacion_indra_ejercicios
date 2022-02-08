package com.formacion.herenciarepaso;

public class Maestro extends Persona {
	public String clases;
	public String materias;
	public Maestro(String nombre, String apellido, int dni, String nacionalidad, String clases,String materias) {
		super(nombre, apellido, dni, nacionalidad);
		this.clases=clases;
		this.materias=materias;
		
	}
	@Override
	public void info() {
		System.out.print(
				"***************Maestro***********\n"+
				"nombre:"+nombre+"\n"+
	 			"apellido:"+apellido+"\n"+
	 			"dni:" +dni+"\n"+
	 			"nacionalidad:" +nacionalidad+"\n"+
	 			"clases:" +clases+"\n"+
	 			"materias:" +materias+"\n");
	}
}
