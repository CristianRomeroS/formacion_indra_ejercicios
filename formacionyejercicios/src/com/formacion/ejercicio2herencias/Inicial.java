package com.formacion.ejercicio2herencias;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c= new Cuenta("Jose");
		c.ingresar(-200);
		System.out.println(c.getCantidad());
		c.ingresar(200);
		System.out.println(c.getCantidad());
		c.retirar(5000);
		System.out.println(c.getCantidad());
		System.out.println(c.toString());
		System.out.println("*********************");
		Cuenta c2= new Cuenta("Pepe",350.50);
		System.out.println(c2.getCantidad());
		c2.retirar(100);
		System.out.println(c2.getCantidad());
		System.out.println(c2.toString());
	}

}
