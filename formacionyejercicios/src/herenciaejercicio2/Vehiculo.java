package herenciaejercicio2;

public class Vehiculo {
 public String matricula;
 public String modelo;
 public int potenciaCv;

 
	 public Vehiculo(String matricula, String modelo, int potenciaCv) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.potenciaCv = potenciaCv;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getModelo() {
		return modelo;
	}
	public int getPotenciaCv() {
		return potenciaCv;
	}

 
 
}
