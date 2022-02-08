package com.formacion.herenciarepaso;

public class Alumno extends Persona{
	public String curso;
	public String turno;
	public String carrera;
	public Alumno(String nombre, String apellido, int dni, String nacionalidad,String curso,String turno,String carrera ){
		super(nombre, apellido, dni, nacionalidad);
		this.curso=curso;
		this.carrera=carrera;
		this.turno=turno;
		
	}
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", turno=" + turno + ", carrera=" + carrera + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", dni=" + dni + ", nacionalidad=" + nacionalidad + "]";
	}
	@Override
	public void info() {
		System.out.print(
				"***************Alumno***********\n"+
				"nombre:"+nombre+"\n"+
	 			"apellido:"+apellido+"\n"+
	 			"dni:" +dni+"\n"+
	 			"nacionalidad:" +nacionalidad+"\n"+
	 			"curso:" +curso+"\n"+
	 			"turno:" +turno+"\n"+
	 			"carrera:"+carrera+"\n");
	}

	


	
	
}
