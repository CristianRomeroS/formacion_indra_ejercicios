package herenciaejercicio;

import java.util.Arrays;

public class Alumno extends Persona {
	private String clasesATomar;
	private String grupo;
	public Alumno(String[] nombres, int edad, String genero, String intereses,String clases,String grupo) {
		super(nombres, edad, genero, intereses);
		this.clasesATomar=clases;
		this.grupo=grupo;
	}
	@Override
	public String toString() {
		return "Alumno [clasesATomar=" + clasesATomar + ", grupo=" + grupo + ", nombres=" + Arrays.toString(nombres)
				+ ", edad=" + edad + ", genero=" + genero + ", intereses=" + intereses + "]";
	}
	


}
