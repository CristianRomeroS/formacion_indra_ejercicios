package herencia.ejerc1;

public class Comercial extends Empleado {

	public double comision;

	//CONSTRUCTOR
	public Comercial(String nombre, int edad, int salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	//GETTERS & SETTERS
	public double getComision() {return comision;}

	public void setComision(double comision) {this.comision = comision;}
	
	//METODO PLUS
	
	public void plus () {
		if(getEdad() > 30 && comision > 2000) {
			
			this.salario = this.salario+this.plus;
			
			System.out.println("Se ha aplicado un plus en el salario de: "+this.plus + "€.  Salario total: " + this.salario);			
		}
	}

	@Override
	public String toString() {
		return "Comercial [Nombre = " + nombre + " || Edad = " + edad + " || Salario = " + salario + " || Comision = " + comision+ 
				"]";
	}
	
	//MÉTODO TO STRING 
	
	
	
	
}
