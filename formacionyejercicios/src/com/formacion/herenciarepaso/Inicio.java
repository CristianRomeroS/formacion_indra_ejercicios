package com.formacion.herenciarepaso;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Persona o= new Persona(null, null, 0, null);
//		o.info();
		Alumno a=new Alumno("Jose","garcia",22222,"espa�ol","4","noche","ingenieria");
		a.info();
		Maestro m=new Maestro("Jose","perez",22222,"espa�ol","Todas","Nose");
		m.info();
		
	}

}
