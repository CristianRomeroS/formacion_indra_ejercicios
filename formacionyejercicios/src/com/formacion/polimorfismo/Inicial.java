package com.formacion.polimorfismo;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehiculo vehiculo[]=new Vehiculo[4];
		Vehiculo vehiculo1 = new Vehiculo("PER124","Mercedez","camioneta");
		Vehiculo vehiculo2 = new VehiculoTurismo("EUW22","Opel","Corsa",5);
		Vehiculo vehiculo3 = new VehiculoFurgoneta("AAA23","Renault","Vivaro",300);
		Vehiculo vehiculo4 = new VehiculoDeportivo("AAA23","Seat","Gt",3023);
		
		VehiculoTurismo vehiculo5= new VehiculoTurismo("RRRUW22","l","45",5);
		System.out.println(vehiculo1.mostrarDatos());
		System.out.println(vehiculo2.mostrarDatos());
		System.out.println(vehiculo3.mostrarDatos());
		System.out.println(vehiculo4.mostrarDatos());
		System.out.println(vehiculo5.mostrarDatos());
		
		
		
	}

}
