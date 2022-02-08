package com.patrones.metodofabrica;

public class FacturaIva extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.21;
	}

}