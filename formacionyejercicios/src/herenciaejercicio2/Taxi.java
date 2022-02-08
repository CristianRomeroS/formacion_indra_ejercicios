package herenciaejercicio2;

public class Taxi extends Vehiculo{
	private int numeroLicencia;
	public Taxi(String matricula, String modelo, int potenciaCv,int numeroLicencia) {
		super(matricula, modelo, potenciaCv);
		this.numeroLicencia=numeroLicencia;
	}

	
	
	public int getNumeroLicencia() {
		return numeroLicencia;
	}

	public void setNumeroLicencia(int numeroLicencia) {
		this.numeroLicencia = numeroLicencia;
	}



	@Override
	public String toString() {
		return "Taxi [numeroLicencia=" + numeroLicencia + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", potenciaCv=" + potenciaCv + "]";
	}
	
}
