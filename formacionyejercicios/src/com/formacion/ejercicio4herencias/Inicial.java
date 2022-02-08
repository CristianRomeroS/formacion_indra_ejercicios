package com.formacion.ejercicio4herencias;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Repartidor 1*******");
		Repartidor r= new Repartidor("Raul",22,875.80,"Zona 3");
		System.out.println(r.toString());
		r.plus();
		System.out.println(r.toString());
		System.out.println("*******Repartidor 2*******");
		Repartidor r2= new Repartidor("kike",22,875.80,"Zona 2");
		System.out.println(r2.toString());
		r2.plus();
		System.out.println(r2.toString());
		
		System.out.println("*******Comercial 1*******");
		Comercial c= new Comercial("Pepe",32,800.80,201.0);
		System.out.println(c.toString());
		c.plus();
		System.out.println(c.toString());
		
		System.out.println("*******Comercial 2*******");
		Comercial c2= new Comercial("Diego",32,875.80,20.0);
		System.out.println(c2.toString());
		c2.plus();
		System.out.println(c2.toString());
	}

}
