package com.patrones.metodofabrica;

public class FactoriaFacturas {
	 
	public static Factura getFactura(String tipo) {

		if (tipo.equals("iva")) {

			return new FacturaIva();
		} else if (tipo.equals("ivaReducido")){
			return new FacturaIvaReducido();
		}
		
		return null;

	}
}
