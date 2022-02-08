package com.formacion.ejercicio1herencias;

public class Libro  {
	String titulo;
	Persona p;
	String isbn;
	int paginas;
	String edicion;
	String editorial;
	String ciudad;
	String pais;
	Fecha f;
	public Libro(String titulo, Persona p, String isbn, int paginas, String edicion, String editorial, String ciudad,
			String pais, Fecha f) {
		this.titulo = titulo;
		this.p = p;
		this.isbn = isbn;
		this.paginas = paginas;
		this.edicion = edicion;
		this.editorial = editorial;
		this.ciudad = ciudad;
		this.pais = pais;
		this.f = f;
	}
	public String getTitulo() {
		return titulo;
	}
	public Persona getP() {
		return p;
	}
	public String getIsbn() {
		return isbn;
	}
	public int getPaginas() {
		return paginas;
	}
	public String getEdicion() {
		return edicion;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getPais() {
		return pais;
	}
	public Fecha getF() {
		return f;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setP(Persona p) {
		this.p = p;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public void setF(Fecha f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Titulo:"+titulo+"\n"
				+edicion+"\n"
				+"autor: "+p+"\n"
				+"ISBN:"+isbn+"\n"
				+ciudad+", "+pais+", "+f+"\n"
				+paginas+" paginas \n";
	}
	
	
	
	
	
	

	
	
}
