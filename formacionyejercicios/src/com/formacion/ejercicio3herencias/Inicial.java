package com.formacion.ejercicio3herencias;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Persona p= new Persona("Rosa",22,'M');
//		System.out.println(p.calcularIMC());
//		System.out.println(p.toString());
//		System.out.println("*********************************");
//		System.out.println(p.esMayorDeEdad());
//		System.out.println(p.toString());
//		System.out.println(p.getSexo());
//		p.comprobarSexo('H');
//		System.out.println(p.getSexo());
		Scanner sc =new Scanner(System.in);
		String nombre,sexo,dni;
		int edad;
		double peso, altura;
		
		System.out.println("Intruduce tu nombre");
		nombre=sc.next();
		System.out.println("Intruduce tu edad");
		edad=sc.nextInt();
		System.out.println("Intruduce tu peso");
		peso=sc.nextDouble();
		System.out.println("Intruduce tu altura");
		altura=sc.nextDouble();
		System.out.println("Intruduce tu sexo M o H");
		sexo=sc.next();
		char s=sexo.charAt(0);
		Persona p0=new Persona(nombre,edad,peso,altura,s);
		Persona p1=new Persona("Sergio",24,'R');
		Persona p2=new Persona();
		p2.setAltura(1.5);
		p2.setEdad(25);
		p2.setNombre("pepe");
		p2.setPeso(90);
		p2.setSexo('H');
		Persona[] personas =new Persona[3];
		personas[0]=p0;
		personas[1]=p1;
		personas[2]=p2;
		
		for(int i=0;i<3;i++) {
			if(personas[i].esMayorDeEdad()) {
				System.out.println("la persona "+i+" es mayor de edad");
			}else {
				System.out.println("la persona "+i+" es menor de edad");
			}
			if(personas[i].calcularIMC()==-1) {
				System.out.println("la persona "+i+" esta en un peso ideal");

			}else if(personas[i].calcularIMC()==1){
				System.out.println("la persona "+i+" esta en un peso de riesgo");
	
			}else {
				System.out.println("la persona "+i+" esta en sobrepeso");
			}

			System.out.println(personas[i].toString());
			System.out.println("----------------------------");
		}

		
		
		
	}

}
