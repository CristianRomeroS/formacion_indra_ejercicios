package com.formacion.interfaces;

public class Gato implements Animal{

	@Override
	public String comunicacion() {
		// TODO Auto-generated method stub
		return "MAullar";
	}

	@Override
	public String alimentacion() {
		// TODO Auto-generated method stub
		return "Pescado y purina";
	}

	@Override
	public String transporte() {
		// TODO Auto-generated method stub
		return "Caminar a 4 patas";
	}

}
