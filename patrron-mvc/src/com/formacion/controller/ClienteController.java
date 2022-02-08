package com.formacion.controller;

import com.formacion.modelo.Cliente;
import com.formacion.view.ClienteView;

public class ClienteController {
	
	private  ClienteView vista;
	private  Cliente modelo;
	public ClienteController(ClienteView vista, Cliente modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	public int getId() {
		return modelo.getId();
	}
	
	public void setId(int id) {
		this.modelo.setId(id);
	}
	
	public String getNombre() {
		return modelo.getNombre();
	}
	
	public void setNombre(String nombre) {
		this.modelo.setNombre(nombre);
	}
	public String getApellidos() {
		return modelo.getApellidos();
	}
	
	public void setApellidos(String apellido) {
		this.modelo.setApellidos(apellido);
	}
	
	public void actualizarVista() {
		vista.imprimirDatosCliente(modelo.getId(), modelo.getNombre(), modelo.getApellidos());
	}
}
