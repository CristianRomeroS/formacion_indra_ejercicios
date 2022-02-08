package com.patrones.metodofabrica;

public class FacturaIvaReducido extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.07;
	}

}