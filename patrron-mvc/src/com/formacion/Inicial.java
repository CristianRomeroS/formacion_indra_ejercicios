package com.formacion;

import com.formacion.controller.ClienteController;
import com.formacion.modelo.Cliente;
import com.formacion.view.ClienteView;

public class Inicial {

	public static void main(String[] args) {
		Cliente modelo = llenarDatosCliente();
		ClienteView vista = new ClienteView();
		ClienteController controlador = new ClienteController(vista, modelo);
		controlador.actualizarVista();
		
		Cliente modelo2 = llenarDatosCliente2();
		ClienteController controlador2 = new ClienteController(vista, modelo2);
		controlador2.actualizarVista();
		
	}
	
	public static Cliente llenarDatosCliente() {
		Cliente cliente = new Cliente();
		cliente.setId(1);
		cliente.setNombre("Juan");
		cliente.setApellidos("Martinez");
		return cliente;
	}
	
	public static Cliente llenarDatosCliente2() {
		Cliente cliente = new Cliente();
		cliente.setId(2);
		cliente.setNombre("Marcos");
		cliente.setApellidos("Castellon");
		return cliente;
	}

}
