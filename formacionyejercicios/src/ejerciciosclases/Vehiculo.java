package ejerciciosclases;

public class Vehiculo {
	private String color;
	private int numSerie;
	
	public Vehiculo(String color, int numSerie) {
		this.color = color;
		this.numSerie = numSerie;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public int getnumSerie() {
		return numSerie;
	}
}
