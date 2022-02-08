package com.patrones.metodofabrica;

public class Main {

	public static void main(String[] args) {
		 
		 Factura f= FactoriaFacturas.getFactura("ivaReducido");
		 f.setId(1);
		 f.setImporte(100);
		 System.out.println(f.getImporteIva());
	}

}
