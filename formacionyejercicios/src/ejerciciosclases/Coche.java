package ejerciciosclases;

public class Coche extends Vehiculo {
	private int cilindrada;
	public Coche(String color, int numSerie,int cilindrada) {
		super(color, numSerie);
		this.cilindrada=cilindrada;
		
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	

}
