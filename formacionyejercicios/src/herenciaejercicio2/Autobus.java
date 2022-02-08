package herenciaejercicio2;

public class Autobus extends Vehiculo{
	
	private int numeroDePlazas;
	public Autobus(String matricula, String modelo, int potenciaCv,int numeroDePlazas) {
		super(matricula, modelo, potenciaCv);
		this.numeroDePlazas=numeroDePlazas;
	}
	public int getNumeroDePlazas() {
		return numeroDePlazas;
	}
	public void setNumeroDePlazas(int numeroDePlazas) {
		this.numeroDePlazas = numeroDePlazas;
	}
	@Override
	public String toString() {
		return "Autobus [numeroDePlazas=" + numeroDePlazas + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", potenciaCv=" + potenciaCv + "]";
	}
	
	
}
