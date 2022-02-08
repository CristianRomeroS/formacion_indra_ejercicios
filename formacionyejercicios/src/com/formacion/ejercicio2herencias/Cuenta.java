package com.formacion.ejercicio2herencias;

public class Cuenta {
	private String titular;
	private double cantidad;
	public Cuenta(String titular, double cantidad) {
		super();
		this.titular = titular;
		this.cantidad = cantidad;
	}
	public Cuenta(String titular) {
		super();
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar(double cantidad) {
		if(cantidad>=0) {
			this.cantidad=cantidad;
			System.out.println("Ingresado correcamente");
		}else {
			System.out.println("Cantidad negativa no se puede ingresar");}
	}
	
	public void retirar(double cantidad) {
		if(cantidad>this.cantidad)this.cantidad=0;
		else this.cantidad-=cantidad;
	}
	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
