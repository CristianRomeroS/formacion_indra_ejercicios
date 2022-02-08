package com.formacion.ejercicio1herencias;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f=new Fecha("Viernes 16 de noviembre de 2001");
		Persona p=new Persona("y Daniel","Liang");
		Libro l=new Libro("Introduccion to java programing",p,"0-13-031997-x",
				784,"3ºa","nose","Prentice-hall","USA",f);
		System.out.println(l.toString());
	}

}
