package herencia.ejerc1;

public class Repartidor extends Empleado {

	public String zona;

	//CONSTRUCTOR
	public Repartidor(String nombre, int edad, int salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	//GETTERS & SETTERS
	public String getZona() {return zona;}

	public void setZona(String zona) {this.zona = zona;}
	
	//METODO PLUS
	
		public void plus () {
			if(getEdad() <25 && zona.equals("zona 3")) {
				
				this.salario = this.salario+this.plus;				
				System.out.println("Se ha aplicado un plus en el salario de: "+this.plus + "€.  Salario total: " + this.salario);			
			}
		}
		
	//MÉTODO TO STRING
		@Override
		public String toString() {
			return "Repartidor [Nombre = " + nombre + " || Edad = " + edad + " || Salario = " + salario+ " || Zona = " + zona 
					+ "]";
		}
}
