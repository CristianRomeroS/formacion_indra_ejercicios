package com.formacion.herenciarepaso;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Persona o= new Persona(null, null, 0, null);
//		o.info();
		Alumno a=new Alumno("Jose","garcia",22222,"español","4","noche","ingenieria");
		a.info();
		Maestro m=new Maestro("Jose","perez",22222,"español","Todas","Nose");
		m.info();
		
	}

}
