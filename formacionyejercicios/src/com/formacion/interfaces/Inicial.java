package com.formacion.interfaces;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro p= new Perro("chow chow","guardian","pequeño");
		System.out.println(p.alimentacion());
		Gato g= new Gato();
		System.out.println(g.alimentacion());
	}

}
