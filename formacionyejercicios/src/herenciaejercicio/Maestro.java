package herenciaejercicio;

public class Maestro extends Persona{
	private String clases;
	private String estacionamiento;
	public Maestro(String[] nombres, int edad, String genero, String intereses,String clases,String estacionamiento) {
		super(nombres, edad, genero, intereses);
		this.clases=clases;
		this.estacionamiento=estacionamiento;
	}
	
}
